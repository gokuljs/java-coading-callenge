package java_coading_challenege;
import java.util.Scanner;
class recursion{
    public static void main (String []args){
        // the program in which the fuction calls itself is called as recursive function 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find factorial");
        int n=sc.nextInt();
        System.out.println(fact(n));

        

    }
    public static int fact(int n){//5,4
        if(n==0){
            return 1;
        }
        return(n*fact(n-1));//5*fact(4),5*4*3*2*1*0

    }
}