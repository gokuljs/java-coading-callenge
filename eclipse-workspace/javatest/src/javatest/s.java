package javatest;
import java.util.*;

public class s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		System.out.println(s);
		String w[]=s.split(" ");
		int count;
		for (int i=0;i<w.length;i++) {
			count=1;
			for(int j=i+1;j<w.length;j++) {
				if(w[i].equals(w[j])) {
					count ++;
					w[j]="0";

					
				}
					
				}
			if (count >1 && w[i]!="0") {
				System.out.println(count+"  "+w[i]);
				
			}
		
		

	}

}
}
