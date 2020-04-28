package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		
		  Iterator<Integer> it = lst.iterator();
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  
		  ListIterator<Integer> litr = lst.listIterator();
		  while(litr.hasNext())
		  {
			  System.out.print(litr.next()+"  ");
		  }
          System.out.println("----------------------------------------------");
		  lst.forEach(ele->{
			  System.out.println(ele);
		  });
		  
	}

}
