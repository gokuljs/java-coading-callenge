package java_coading_challenege;
import java.util.*;
class listtoarray{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        System.out.println(a1);
        // converting arraylist to array 
        int [] a=new int[a1.size()];
        for (int i=0;i<a1.size();i++){
            a[i]=a1.get(i);
        }
        System.out.println("printing array elements ");
        for (int i=0;i<a1.size();i++){
            System.out.println(a[i]);
        }
        Object[] objects =a1.toArray(); 
        for (Object obj: objects)
            System.out.println(obj+" ");
        



    }
}