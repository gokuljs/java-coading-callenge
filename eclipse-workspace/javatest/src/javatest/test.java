package javatest;
import java.util.*;

public class test {
public static void main(String []args) {
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String n=sc.nextLine();
	char []c=n.toCharArray();
	int count;
	for (int i=0;i<n.length();i++) {
		count=1;
		for(int j=i+1;j<n.length();j++) {
			if(c[i]==c[j]&&c[i]!=' ') {
				count++;
				c[j]='\0';//for not attending visited strings
	
			}
			
		}
		if(count>1&&c[i]!='0') { // if count >2 then considered visited strings
			System.out.println(c[i]);
		}
	}
	
	
}
}
