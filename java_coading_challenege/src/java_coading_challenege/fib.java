package java_coading_challenege;
import java.util.*;
class fib{
    public static void main(String []args){
        // program for printing fibnoccai numbers 
        Scanner sc=new Scanner(System.in);
        // fibnoccai is the sum of previouse two numbers 
        System.out.println("enter total number of elements that should be entered ");
        int n=sc.nextInt();
        fib i=new fib();
        i.fib1(n);
        long j=i.fib2(n);
        
        
    }
    public void fib1(int n){
        int a=0,b=0,c=1;
        for(int i=1;i<=n;i++){
            a=b;//a=0,1,1,2
            //b=1,1,2,3
            //c=1,2,3,5
            b=c;
            c=a+b;
            System.out.println(a);
        }
}
    public long fib2(int n){
        if (n<=1){
            return n;
        }
        else{
            return(fib2(n-1)+fib2(n-2));
        }

    }

}