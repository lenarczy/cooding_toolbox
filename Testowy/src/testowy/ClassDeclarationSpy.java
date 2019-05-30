package testowy;

import static java.lang.System.out;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

public class ClassDeclarationSpy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		args = new String[]{"testowy.Dog"};
		try {
			Class<?> c = Class.forName(args[0]);
			out.format("Class:%n  %s%n%n", c.getCanonicalName());
			out.format("Modifiers:%n  %s%n%n",Modifier.toString(c.getModifiers()));
			out.format("Type Parameters:%n");
			TypeVariable[] tv = c.getTypeParameters();
			if(tv.length > 0) {
				out.format("  ");
				for(TypeVariable t : tv) {
					out.format("%s ", t.getName());					
				}
				out.format("%n%n");
			} else {
				out.format("  -- No Type Parameters --%n%n");
			}
			for(Field f : c.getDeclaredFields()) {
				out.format("Type %s %s", f.getName(), f.getType().getCanonicalName());
			}
			
//			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
