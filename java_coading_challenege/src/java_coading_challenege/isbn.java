package java_coading_challenege;
import java.util.*;
class isbn {
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        // program to validate isbn code in java
        /*o verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third digit and so on until we add 1 time the last digit. If the final number leaves no remainder when divided by 11, the code is a valid ISBN
        

*/
        System.out.println("enter the isbn code");
        long n=sc.nextLong();
        long temp=n;//0112112425
        int i=1;
        double sum=0;
        long r;
        while(temp!=0){
            r=temp%10;//5,2,4
            sum=sum +(r*i);//0+5*0,0+2*1,,2+4*2 ..........
            temp=temp/10;
            i++;//i=1,2,3
        }
        System.out.println(sum);
        if (sum%11==0){
            System.out.println("isbn number");            
        }
        else {
            System.out.println("not isbn number");

        }

    }
}