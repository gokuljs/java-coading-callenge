package java_coading_challenege;
import java.util.Scanner;
class bellman{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range of adjacny matrix");
        int n=sc.nextInt();
        int[][] a=new int [100][100];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("adjaceny matrix is ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(a[i][j]==0){
                    a[i][j]=99;
                }
            }
        
        }
        int []d=new int [100];
        System.out.println("enter the source matrix");
        int s=sc.nextInt();
        solve(n,s,d,a);
}
public static void solve(int n,int s,int[] d,int [][]a){

    for(int i=1;i<n;i++){
        d[i]=99;
    }
    d[s]=0;
    for (int k=1;k<n-1;k++){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (a[i][j]!=99){
                if(d[j]>d[i]+a[i][j]){
                    d[j]=d[i]+a[i][j];
                }
            }
            }
        }


    }
    System.out.println("shortest path");
    for (int i=0;i<n;i++){
        System.out.println(d[i]);
    }
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            if (a[i][j]!=99){
                if(d[j]>d[i]+a[i][j]){
                    System.out.println("it has negative cycle");
                }
            }
        }
    }

}

}