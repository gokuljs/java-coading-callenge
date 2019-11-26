package java_coading_challenege;
import java.util.*;
class elementcheck{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList <String> a1=new ArrayList<String>();
        a1.add("gokul");
        a1.add("chandu");
        a1.add("hari");
        a1.add("charan");
        a1.add("abs");
        a1.add("la");
        System.out.println("enter the element that u want to check ");
        String s=sc.nextLine();
        boolean ans =a1.contains(s);
        if (ans){
            System.out.println("entered element is present "+s);
        }
        else
        {
            System.out.println("entered element is not present ");

        }


    }
}