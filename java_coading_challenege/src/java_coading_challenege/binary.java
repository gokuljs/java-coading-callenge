package java_coading_challenege;
import java.util.*;
import java.lang.Math;
class binary{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        binary i=new binary();
        System.out.println("conversion of binary to decimal number");
        i.btod();
        System.out.println("conversion of decimal to binary digit number");
        i.dtob();

    }

    public void btod(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary digit number");
        int n=sc.nextInt();///11
        int temp=n;//
        int r;
        double sum=0;
        int i=0;
        //conversion of binary digit to decimal digit number 
        //comnnsider a binary digit number 111
        //consider 111
        //decimal=1*2^2+1*2^1+1*2^0;

        while(temp!=0){
            r=temp%10;//r=1 //seperating the right most element
            sum=sum+(r*Math.pow(2, i));//sum=0+1+2^0=2,2+1+2,rightmost elemnt 2 to the power zero added to the sum 
            i++; 
            temp=temp/10;
        }
        System.out.println(sum);


    }
    /*Store the remainder when the number is divided by 2 in an array.
Divide the number by 2
Repeat the above two steps until the number is greater than zero.
Print the array in reverse order now.
For Example:
If the binary number is 10.
Step 1: Remainder when 10 is divided by 2 is zero. Therefore, arr[0] = 0.
Step 2: Divide 10 by 2. New number is 10/2 = 5.
Step 3: Remainder when 5 is divided by 2 is 1. Therefore, arr[1] = 1.
Step 4: Divide 5 by 2. New number is 5/2 = 2.
Step 5: Remainder when 2 is divided by 2 is zero. Therefore, arr[2] = 0.
Step 6: Divide 2 by 2. New number is 2/2 = 1.
Step 7: Remainder when 1 is divided by 2 is 1. Therefore, arr[3] = 1.
Step 8: Divide 1 by 2. New number is 1/2 = 0.
Step 9: Since number becomes = 0. Print the array in reverse order. Therefore the equivalent binary number is 1010.

Below diagram shows an example of converting the decimal number 17 to equivalent binary number.


    */
    public void dtob(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n=sc.nextInt();
        int []bin=new int [100];
        int i=0;
        while(n>0){
            bin[i]=n%2;

            n=n/2;
            i++;
        }
        for (int j=i-1;j>=0;j--){
            System.out.print(bin[j]);

        }

    }
}