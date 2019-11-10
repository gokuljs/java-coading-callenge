package java_coading_challenege;
import java.util.Scanner;


// program is for swapping of two variables without using temp

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// take two inputs x and y
		System.out.println("enter the variable x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		// solving this using operators 
		// x=10
		// y=20
		// x=x+y   10+20=30
		// y=x-y   30-20=10
		// x=x-y   30-10=20
		// now y=10 and x=20
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping x="+x+"and y="+y);
				
				
		
		
		

	}

}
