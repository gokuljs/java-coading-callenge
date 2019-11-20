package java_coading_challenege;

import java.util.*;

class equals {
    public static void main (String [] args){
        // cheching eauals of two number by using equals of two numbers 
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        // solving using relational operator 
        if (x==y)
        {
            System.out.println("x=y");

        }
        else
        {
            System.out.println("x!=y");
        }
        // solving using arithmatic operator 
        if ((x^y)==0){
            System.out.println("x equals y");

        }   
        else
        {
            System.out.println("x != y");
        }     

        // solving this using with the built in function in java 

        System.out.println("to check equals of two numbers ");
        if (Integer.compare(x,y)==0){
            System.out.println("equals to ");
        }
        else 
        {
            System.out.println("not equal");
        }
        

        // . compare method is the built in function in java to compare two inttegrs in java 
        // syantax to use compare method Integer.compare(x,y)
        // if x==y then it gives 0
        // else -1 x<y
        //else 1 x>y

        // equals is the built in method to check equality of two strings 
        //x.equals(y); is the syntax of that
        //when u do or operation in java if it equlas to zero then the two integers are equal





    

    }
}