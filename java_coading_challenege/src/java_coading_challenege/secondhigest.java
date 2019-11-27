package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class secondhigest{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random r =new Random();
        int n=5;
        int []a=new int [n+1];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max = "+max);



        

    }
}