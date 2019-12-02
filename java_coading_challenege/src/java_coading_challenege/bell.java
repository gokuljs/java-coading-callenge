package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class bell{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int n=sc.nextInt();
        int [][]a=new int [n+1][n+1];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println(a[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (a[i][j]==0){
                    a[i][j]=99;
                }
            }
        }
        int []d=new int [1000];
        System.out.println("enter the source matrix");
        int s=sc.nextInt();
        solve(s,n,d,a);
        }
        public static void solve(int s,int n,int []d,int [][]a){
            for(int i=0;i<n;i++){
                d[i]=99;
            }
            d[s]=0;
            for(int k=0;k<n-1;k++){
                for(int i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        if (a[i][j]!=99){
                if(d[j]>d[i]+a[i][j]){
                    d[j]=d[i]+a[i][j];
                }
                    }
                }
            }
            for (int i=0;i<n;i++){
                System.out.println(d[i]);
            }


        }
}
}