import java.util.*;
class hash{
    public static void main(String args[]){

        //hash tabels are part of java.util
        // there are concrete wat to create dictionary
        // hash tabels are reengineered to add map interface 
        // Hashtable()
         // Hashtable(int n)
         // hashtable(int n ,float s)

         Hashtable balance=new Hashtable();
         Enumeration <String> names;
         String str;
         double bal;
         balance.put("gokul",1000.10);
         System.out.println(balance.get("gokul"));
         balance.put("apple","green");
         System.out.println(balance.get("gokul"));





    }
}