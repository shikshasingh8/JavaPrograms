package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Automation");
		a1.add("Testing");
		a1.add("Ram");
		a1.add("Seeta");
		System.out.println(a1);
		boolean b2= a1.contains("Testing");
		System.out.println(b2);
		
		Iterator<String> i1= a1.iterator();
		

	}

}
