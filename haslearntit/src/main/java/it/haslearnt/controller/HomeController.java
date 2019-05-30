/*
 * Copyright: this code is distributed under WTFPL version2
 * In short: You just DO WHAT THE FUCK YOU WANT TO.
 */

package it.haslearnt.controller;

import java.util.Random;

import org.apache.cassandra.thrift.ConsistencyLevel;
import org.scale7.cassandra.pelops.Bytes;
import org.scale7.cassandra.pelops.Mutator;
import org.scale7.cassandra.pelops.Selector;
import org.scale7.cassandra.pelops.pool.IThriftPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private IThriftPool pool;

    @Autowired
    @Qualifier("appInfoText")
    private String appInfoText;

    // TODO: get it out or make it shine
    @RequestMapping("/app-info")
    public String home(Model model) {
        Long t0 = System.currentTimeMillis();
        for (int row = 0; row < 100; row++) {
            for (int col = 0; col < 100; col++) {
                Mutator m = pool.createMutator();
                m.writeColumn("Notes", "test" + row, m.newColumn(Bytes.fromLong(col), "Sample text", 60));
                m.execute(ConsistencyLevel.ONE);
            }
        }
        Long writeTime = System.currentTimeMillis() - t0;

        Random random = new Random(System.nanoTime());

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int row = random.nextInt(100);
            int col = random.nextInt(100);
            Selector s = pool.createSelector();
            s.getColumnFromRow("Notes", "test" + row, Bytes.fromLong(col), ConsistencyLevel.ONE);
        }
        Long readTime = System.currentTimeMillis() - t0;

        model.addAttribute("writeSpeed", 20000000 / writeTime);
        model.addAttribute("readSpeed", 20000000 / readTime);

        // TODO: MZA: Should be moved to the footer
        model.addAttribute("appInfoText", appInfoText);

        return "home";
    }

}
