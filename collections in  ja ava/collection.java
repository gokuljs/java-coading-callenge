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
		
		System.out.println(list.trimToSize());



		list.clear();
		System.out.println(list);
		



		
	}

}
