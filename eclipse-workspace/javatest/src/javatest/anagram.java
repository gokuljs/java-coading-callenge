package javatest;

import java.lang.*;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		if(c1.length==c2.length) {
	        Arrays.sort(c1);
	        Arrays.sort(c2);
	        for(int i=0;i<c1.length;i++) {
	        	if (c1[i]==c2[i]) {
	        		System.out.println("anagram");
	        	}
	        	else {
	        		System.out.println("not anagram");
	        	}
	        }
		}

		
		
	}

}
