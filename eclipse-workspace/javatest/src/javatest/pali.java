package javatest;
import java.util.*;

public class pali {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String n=sc.nextLine();
		char[] c=n.toCharArray();//GOKUL
		int l=n.length();//5
		System.out.println("l="+l);
		char []p=new char[l+1];
		System.out.println("string");
		for(int i=0;i<l;i++) {
			System.out.println(c[i]);
		}
		int j=0;
		for(int i=l-1;i>=0;i--) { //5,4,3,2,1,0
			p[j]=c[i];
		j++;
		}
		System.out.println("reverse of a string");
		for(int i=0;i<l;i++) {
			System.out.println(p[i]);
		}
		int flag=0;
		for( int i=0;i<l;i++) {
			if(p[i]==c[i]) {
				flag=1;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
