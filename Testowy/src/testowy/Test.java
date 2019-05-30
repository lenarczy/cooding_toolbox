/**
 * 
 */
package testowy;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author rafal
 *
 */
public class Test {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(2);
		Map<Integer, Integer> h = new HashMap<Integer, Integer>();
		h.put(1, 0);
		Integer tmp = h.put(1,h.get(1)+1);
		tmp++;
		
		
		
		int u = 8;
		int ss = 5;
		System.out.println(new Integer(ss).doubleValue() > new Integer(u).doubleValue()/2);
		*/
		/*Calendar calendar = Calendar.getInstance();
		calendar.roll(Calendar.HOUR, 24);
		System.out.println(calendar.getTime().toString());*/
		List<Name> listA = Arrays.asList(new Name("Ala", "Kowalska",19),
				new Name("Ola","Kowalska",23),
				new Name("Janina", "Adamiak",25),
				new Name("Maja","Janicka",11)
				);
		List<Name> list = new ArrayList<Name>(listA);
		SortedSet<Name> sortes = new TreeSet<Name>(listA);
		SortedMap<String,String> sMap = new TreeMap<String, String>();
		Queue<Name> queue = new PriorityQueue<Name>();
		
		for(Name n:listA) {
			System.out.println(n);
			queue.offer(n);
		}
		System.out.println("Kolejka"+queue);
		Name nn = queue.poll();
		while(nn != null) {
			System.out.println(nn);
			nn = queue.poll();
		}
		List<Integer> listaaa = new ArrayList<Integer>();
		int num = 4819;
		while (num > 0) {
			int digit = num % 10;
			listaaa.add(digit);
			num /= 10;
		}
		Collections.reverse(listaaa);
		System.out.println(listaaa);
		
		
		
		String s = new String("4123");
		
		char[] chs = s.toCharArray(); 
		int[] ints = new int[chs.length];
		for(int i = 0; i < chs.length; i ++) {
			ints[i]= Character.digit(chs[i], 10);			
		}
		
		System.out.println(Integer.toString(25, 2));
		System.out.println(list);
		System.out.println(sortes);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.rotate(list, 2);
		System.out.println(list);
		
		Collections.sort(listA,new Comparator<Name>() {

			@Override
			public int compare(Name o1, Name o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
			
		} );
		System.out.println(listA);
	}

}

class Name implements Comparable<Name> {
	
	private String name, sname;
	private Integer age;
	public Integer getAge() {return this.age;};
	public Name(String name, String sname) {
		this.name = name;
		this.sname = sname;
		this.age = null;
	}
	
	public Name(String name, String sname, int age) {
		this.name = name;
		this.sname = sname;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Name [name=" + name + ", sname=" + sname + ", age="+age.toString()+"]";
	}



	@Override
	public int compareTo(Name n) {
		int scmp = sname.compareTo(n.sname);
		return scmp!=0 ? scmp: name.compareTo(n.name);
	}

	/*@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Name)) return false;
		Name n = (Name)obj;
		return n.name.equals(name) && n.sname.equals(sname);
	}*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}

}