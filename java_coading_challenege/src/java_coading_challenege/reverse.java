package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class reverse {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int []a=new int [100];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int start=0;
        int end =n-1;
        int temp;
        while (start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end --;
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
        
        
        


    }
}