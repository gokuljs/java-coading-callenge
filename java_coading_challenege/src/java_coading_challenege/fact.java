package java_coading_challenege;
import java.util.Scanner;


class fact{
    public static void main(String [] args){
        Scanner Sc=new Scanner(System.in);
        // question is to find fatcorial of a given number 
        System.out.println("enter the variable x ");
        int x=Sc.nextInt();
        int fact=1;
        for (int i=1;i<=x;i++){
            fact=fact*i;
        }
        System.out.println("factorial of a number "+fact);
    }
}