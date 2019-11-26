package java_coading_challenege;
import java.util.*;


class transverse{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // program to transverse an arraylist  ;
        // arraylist is something more flexible than array 
        // size incrementation and decrementation happens by itsel
        //when u add an elemnt into array lisy size increase by itself 
        // deleting an elemment size decreases by itself
        ArrayList <Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        System.out.println(a);
        //traverse all the element in the list 
        //this traverse all the element using loop
        //size is the method specified in java collections to get size of an arraylist 
        // 
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));

        }
        //traverse all the element in the list 
        //using for each loop
        for (Integer i : a) 
        System.out.print(i + " \n"); 
        //iterator in java 
        //iterator is the one which belongs to collection framework
        //it allows traverse all the elements in the list and add and delete element in list 
        Iterator i=a.iterator();
        System.out.println("$$$$$$$$$$$$$");

        while(i.hasNext()){// has next checks is there any element to iterate or not 
            
            System.out.println(i.next());
        }



    }
}