package javatest;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String sp=sc.nextLine();
		System.out.println(sp);
		reverse obj=new reverse();
		obj.reverse1(sp);

	}
	public void reverse1(String str) {
		if((str==null) || (str.length()<=1)){
			System.out.println(str);
		}
		else {
			System.out.println(str.charAt(str.length()-1));
			reverse1(str.substring(0,str.length()-1));
		}
	}
}
