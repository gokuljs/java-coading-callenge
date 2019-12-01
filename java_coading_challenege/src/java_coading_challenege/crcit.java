package java_coading_challenege;
import java.util.Scanner;
class crcit{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the degree of the dataword");
        int n=sc.nextInt();
        System.out.println("enter the dataword");
        int []a=new int [1000];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the degree of divisor");
        int gen=sc.nextInt();
        System.out.println("enter the divisior");
        int []b=new int [1000];
        for (int i=0;i<gen;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(" dataword");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int m=n;
        n=n+gen-1;
        for(int i=m;i<n;i++){
            a[i]=0;
        }
        System.out.println("enter the code word");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int []poly=new int [1000];
        for (int i=0;i<n;i++){
    
            poly[i]=a[i];
        }
        System.out.println("poly[i]");

        for (int i=0;i<n;i++){
            System.out.println(poly[i]);
        }

        div(n,m,poly,b);
        System.out.println("remainder");
        for (int i=0;i<n;i++){
            System.out.println(poly[i]);
        }
        for (int i=0;i<3+m;i++){
            a[i]=a[i]^poly[i];
        }
        int []s=new int [1000];
        for (int i=0;i<n;i++){
         s[i]=a[i];   
        }
        div(n,m,s,b);
        System.out.println("reminder2");
        for (int i=0;i<n;i++){
            System.out.println(s[i]);
        }
        int flag=0;
        for (int i=0;i<n;i++){
            if (b[i]==0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println(" error");
        }
        else{
            System.out.println("no error");
        }

}
public static void div(int n,int m,int []poly,int []b){
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
