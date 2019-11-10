package java_coading_challenege;

import java .util.Scanner;

class java{
     public static void main(String[] args) {

        // swap done using temp variable;
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x="+x);
        System.out.println("y="+y);


        
    }
}