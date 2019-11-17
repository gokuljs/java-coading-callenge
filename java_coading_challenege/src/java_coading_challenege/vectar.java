import java.util.*;
class vectar{
    public static void main (String []args){
        //vectar implements a dynamic array 
        // similiar to arraylist vectar is synchronised 
        // implenets list interface 
        //vector v=new vector()
        //vector v=new vector(int n) creates a vectar by specified size 
        //vector v=new vector(int n,int incr) to creatse a vectar whos intial size and increments by incr
        //vector v=new vector()
        // in vectar u dont need add new array size actually 
        // vectar() creates a vectar who size is 10

        Vector <Integer> v=new Vector <Integer> (3,2);
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement(4);
        v.addElement(4);
        v.addElement(4);
        v.addElement(4);
        v.addElement(4);
        v.addElement(4);
        System.out.println(v.size());

        System.out.println(v.capacity());






    }
}