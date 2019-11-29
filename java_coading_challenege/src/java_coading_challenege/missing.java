package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class missing{
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int total = (n + 1) * (n + 2) / 2; 

        int []a=new int [100];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            total=total-a[i];

        }
        System.out.println("d"+total);

    }
}