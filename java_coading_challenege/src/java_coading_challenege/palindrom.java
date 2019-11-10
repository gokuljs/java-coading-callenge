package java_coading_challenege;
import java.util.Scanner;
// palindrome of a given number 
 class palindrome{
     public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your number"); // asking for number
         int n=sc.nextInt();
         int r=0;  // intializing r to zero
         int temp=n; // intializing temp variable
         int sum=0; // intializing sum to zero 
        while(n!=0){ // intially n=23
        r=n%10;  // r=23%10=3
        sum=(sum*10)+r;//0*10+3
        n=n/10;// n=2

        }
        if(temp==sum){
            System.out.println("palindrome");

        }
        else {
            System.out.println("not palindrome");
        }











     }
 }