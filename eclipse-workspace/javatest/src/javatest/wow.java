package javatest;

import java.lang.*;
import java.util.*;

public class wow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {//0,1,2
			System.out.println(s1[i]);
		}
		int j=0;
		System.out.println(j);
		String []s2=new String[100];
		for(int i=s1.length-1;i>=0;i--) {//
			s2[j]=s1[i];
			j++;
		}
		for(int i=0;i<s1.length;i++) {
			System.out.println(s2[i]);
		}
		

	}

}
