package java_coading_challenege;
import java.util.Scanner;
import java.util.Random;
class transpose{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // transpose of the matrix means changing rows and columns of given matrix
        System.out.println("enter the size of the matrix");
        int n=sc.nextInt();
        int [][]a=new int [n+1][n+1];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing the matrix");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("transpose of a matrix");
        /*Transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, transpose of A[][] is obtained by changing A[i][j] to A[j][i].

        */
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println(" ");
        }






    }
}