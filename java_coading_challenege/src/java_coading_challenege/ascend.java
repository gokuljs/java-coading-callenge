package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
// program to sort array in ascending orders

class ascend{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total  numbers you want to sort ");
        int n=sc.nextInt();
        int []a=new int [100];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("elements before sorting ");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int temp;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[i]>a[j]);
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;


            }
            

        }
        System.out.println("sorted array is ");
        for (int i=0;i<n;i++){
           System.out.println(a[i]);
            

        }
        
        


    }
}