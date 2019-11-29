package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class subelement{
    public static void main (String []args){
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("enter the array size");
        int []a=new int [100];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element in array");
        int x=sc.nextInt();
        int flag=0;
        for (int i=0;i<n;i++){
            if(a[i]==x){
                flag=1;
                break;
            
            }



        }
        if(flag==1){
            System.out.println("element found "+x);
        }
        else{
            System.out.println("elements not found");
        }

    }
}