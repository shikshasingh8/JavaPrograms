package CollectionFramework;

import java.util.ArrayList;

public class ArrayList_String {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Automation");
		a1.add("Testing");
		a1.add("Ram");
		a1.add("Seeta");
		System.out.println(a1);
		boolean b2= a1.contains("Testing");
		System.out.println(b2);
		
		String a3=a1.get(2);
		System.out.println(a3);
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.addAll(a1);
		a2.add("ritu");
		System.out.println(a2);
		boolean s=a1.equals(a2);
		System.out.println(s);
		//a2.clear();
		boolean b1=a2.isEmpty();
		System.out.println(b1);
		boolean b3= a2.containsAll(a1);
		System.out.println(b3);
		System.out.println("Before removing a2"+ a2);
		a2.remove(2);
		System.out.println("after removing index 2"+ a2);
		
		a2.removeAll(a1);
		System.out.println(a2);
	}

}
