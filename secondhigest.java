import java.util.Scanner;
import java.util.*;
class secondhigest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if (max<a[j]){
                    max=a[j];
                }
            }
        }
        System.out.println(max);
        int smax=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if (a[i]>a[j]&&a[i]<max){
                    smax=a[i];
                }
            }
        }
        System.out.println(smax);

    }
}