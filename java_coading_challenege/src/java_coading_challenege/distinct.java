package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class distinct{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random r =new Random();
        System.out.println("printing random numbers");
        int n=sc.nextInt();
        System.out.println(n);
        int []a=new int [n+1];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        for (int i=0;i<n;i++){
            System.out.println("random numbers  =  "+a[i]);
        }
        int count =0;

        // finding the distinct elements in java 
        for (int i=0;i<n;i++){//i=0 
            int j;
            for( j=0;j<n;j++){//j=0
                if(a[i]==a[j]){//a[0]==a[0]
                   break;//leave the inner loop

                }
            }
            if(i==j){//i==j
                count=count+1;// 
                System.out.println(a[i]);
            }
        }
        System.out.println("count ="+count);
    }

}
