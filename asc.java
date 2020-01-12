import java.util.Scanner;
import java.util.*;

class asc{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a[]={12,13,13,14,14,5,6,7,8,3,};
        int n=a.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}