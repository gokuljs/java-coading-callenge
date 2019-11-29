package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class reversearr{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n=sc.nextInt();
        int a[]=new int [100];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int []b=new int [100];
        int j=n;
        for (int i=0;i<n;i++ ){
            b[j-1]=a[i];
            j--;
        }
        System.out.println("reversed array is ");
        for (int i=0;i<n;i++ ){
          System.out.println(b[i]);
        }


    }
}