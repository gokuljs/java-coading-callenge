import java.util.*;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java array list classes uses dynamic array forsolvinf the problems
		ArrayList<String> list=new ArrayList<String>();
		list.add("gokul");
		list.add("guru:");
		list.add("gokul");
		list.add("guru:");
		list.add("gokul");
		list.add("guru:");
		list.add("gokul");
		list.add("guru:");
		list.add("gokul");
		list.add("guru:");
		list.add("gokul");
		list.add("guru:");list.add("gokul");
		list.add("guru:");list.add("gokul");
		list.add("guru:");list.add("gokul");
		list.add("guru:");list.add("gokul");
		list.add("guru:");
		System.out.println(list);
		list.remove("guru");
		System.out.println(list);
		list.remove("guru");
		

		System.out.println(list.size());
		System.out.println(list.get(10));
		
		// looping through all elements using list iterator
		// iterator can traverse only in one direction 
	
		Iterator li=list.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		li.remove();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		// traversing all the elements using for each loop
		System.out.println("------------------------------------------------------------------");

		for(String obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("------------------------------------------------------------------dd");
		
		// traversing all elements using listiterator
		
		ListIterator<String> lo=list.listIterator(list.size());
		while(lo.hasPrevious()) {
            String str=lo.previous();  
			System.out.println(str);
		}
		System.out.println("------------------------------------------------------------------dd");
        // traversing all elements using all list using for loop
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println(s);
			
		}
		
		
		



		



		
	}

}
