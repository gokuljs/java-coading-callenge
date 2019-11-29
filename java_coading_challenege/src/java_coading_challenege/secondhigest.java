package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class secondhigest{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random r =new Random();
        int n=5;
        int []a=new int [n+1];
        System.out.println("enter the numbers ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        System.out.println("sorting element in descending order");
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        System.out.println("sorted array");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);

        }
        int max1=a[0];
        int max2=a[1];
        
        System.out.println("second heigest elemnet "+max2);
        


        




        

    }
}