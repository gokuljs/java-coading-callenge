package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class zerosto1{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("program to print 0 towards left and 1 towards right ");
        System.out.println("enter the binary digit number ");
        System.out.println("enter the total digit");
        int n=sc.nextInt();
        int []a=new int [100];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for (int i=0;i<n;i++){
            if (a[i]==0){
                count=count+1;
            }
        }
        System.out.println("count"+count);
        for (int i=0;i<count;i++){
            a[i]=0;
        }
        for (int j=count;j<n;j++){
            a[j]=1;
        }
        System.out.println("final array is");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }



    }
}