package javatest;
import java.util.*;

public class oo {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str="googogoogogo";
		char[] c=str.toCharArray();
		int count;
		for(int i=0;i<c.length;i++) {
			count=1;
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]) {
					count++;
					c[j]='0';
				}
			
		}
		if(count>1 && c[i]!='0') {
			System.out.println("count ="+count+"and string is "+c[i]);
		}
		
	}

}
}
