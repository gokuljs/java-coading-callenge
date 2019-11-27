package java_coading_challenege;
import java.util.*;
class isbn {
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        // program to validate isbn code in java
        /*o verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third digit and so on until we add 1 time the last digit. If the final number leaves no remainder when divided by 11, the code is a valid ISBN
        

*/
        System.out.println("enter the isbn code");
        double n=sc.nextDouble();
        double temp=n;
        int i=0;
        double sum=0;
        double r;
        while(temp!=0){
            r=temp%10;
            sum=sum +(r*i);
            i++;
        }
        System.out.println(sum);

    }
}