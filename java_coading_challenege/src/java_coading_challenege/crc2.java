package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class crc2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the degree of datawaord");
        int n=sc.nextInt();
        int []a=new int[1000];
        System.out.println("enter the of dataword");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the degre of divisor");
        int gen=sc.nextInt();
        int []b=new int [100];
        System.out.println("enter the  divisor");       
        for(int i=0;i<gen;i++){
            b[i]=sc.nextInt();
        }
        int m=n;
        n=n+gen-1;
        for(int i=m;i<n;i++){
            a[i]=0;
        }
        System.out.println("codeword");
        int []poly=new int [1000];
        for(int i=0;i<n;i++){
            poly[i]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(poly[i]);
        }
        div(n,m,poly,b);
        System.out.println("printg the reminder");
        for (int i=0;i<n;i++){
            System.out.println(poly[i]);
        }
        for (int i=0;i<3+m;i++){
            a[i]=a[i]^poly[i];
        }
        int []s=new int [100];
        for (int i=0;i<n;i++){
            s[i]=a[i];
        }
        div(n,m,s,b);
        for (int i=0;i<n;i++){
        System.out.println(s[i]);
        }
        int flag=0;
        for (int i=0;i<n;i++){
            if(s[i]!=0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("no error");
        }
        else {
            System.out.println("error");
        }






        





    }
    public static void div(int n,int m,int[] poly,int []b){
        int count=0;
        for (int i=0;i<m;i++){
            if(poly[i]==b[0]){
                
            for (int j=i;j<4+i;j++){
                poly[j]=poly[j]^b[count++];
            }
            count=0;
            }
        }
    }
}