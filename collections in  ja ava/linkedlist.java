import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// java uses doubly linked list
	// in douvly linkied list we can add and remove elements from  both sides 
	
	LinkedList<String>li=new LinkedList<String>();

	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	li.add("gokul");
	System.out.println(li);
	
	li.add("guru");
	li.addFirst("gandu");
	System.out.println(li);
	li.removeFirst();
	li.removeLast();
	System.out.println(li);
	
	for(int i=0;i<li.size();i++) {
		String str=li.get(i);
		System.out.println(str);
	}
	System.out.println("-----------------------");

	Iterator list=li.iterator();
	while(list.hasNext()) {
		System.out.println(list.next());
	}
	

	}

}
