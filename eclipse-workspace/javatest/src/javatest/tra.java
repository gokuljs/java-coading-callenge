package javatest;
import java.util.*;

public class tra {
	public static void main(String []args) {
		System.out.println("enter the size of matrix");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][]a=new int [100][100];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
	
			}
		}
		System.out.println("original matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]);
	
			}
			System.out.println();
		}
		System.out.println("transpose of matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[j][i]);
	
			}
			System.out.println();
		}
	}
}
