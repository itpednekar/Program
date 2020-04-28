package test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class Program {

	public static void main(String[] args) {
		/*HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Ishwari");
		hm.put(2, "Tukaram");
		hm.put(3, "Pednekar");

		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1, "Ishwari");
		hm2.put(2, "Tukaram");
		hm2.put(3, "Pednekar");

		System.out.println(hm.equals(hm2));

		for (Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + "  " + e.getValue() +"  " +e.hashCode());
		}
		*/
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "ABV");
		ht.put(2, "XYZ");
		ht.put(3, "ACF");
		
		 Enumeration e = ht.elements();
		 while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
