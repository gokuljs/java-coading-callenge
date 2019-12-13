import java.util.Scanner;
class transpose{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the matrix ");
        int n=sc.nextInt();
        int [][]a=new int [100][100];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix is ");
        System.out.println("original matrix is ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("transpose of a matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]);
            }
            System.out.println("");
        }
    }
}