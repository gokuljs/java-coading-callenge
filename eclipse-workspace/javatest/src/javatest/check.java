package javatest;
import java.util.*;
import java.lang.*;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int length=s.length();
		int upper_case=0;
		int lower_case=0;
		int digit=0;
		int others=0;
		for(int i=0;i<s.length();i++ ) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper_case++;
				
			}
			else if(Character.isLowerCase(ch)) {
				lower_case++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				others++;
			}
		}
		double upper=(upper_case*100)/length;
		double lower=(lower_case*100)/length;
		double digits=(digit*100)/length;
		double other=(others*100)/length;
		System.out.println("upper ="+upper);
		System.out.println("lower ="+lower);
		System.out.println("digits ="+digits);
		System.out.println("other ="+other);

		

		


		

	}

}
