package java_coading_challenege;

import java.util.Scanner;
class leak{
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("buket size");
		int n=sc.nextInt();
		System.out.println("flow control");
		int r=sc.nextInt();
		System.out.println("time interval");
		int ti=sc.nextInt();
		int time;
		int [] pktrcv=new int[100];
		int [] pktleft=new int[100];
		int [] pktdrop=new int[100];
		int [] pktsent=new int[100];
		
		for (int i=0;i<ti;i++) {
			pktrcv[i]=sc.nextInt();
		}
		for (int i=0;i<ti;i++) {
			if (pktrcv[i]>r) {
				pktsent[i]=r;
				
			}
			else if(pktrcv[i]+pktleft[i]>r){
				pktsent[i]=r;
			}
			else if(pktrcv[i]+pktleft[i]<r) {
				pktsent[i]=pktrcv[i]+pktleft[i];
			}
			else
			{
				pktsent[i]=r;

				
			}
		}
		pktleft[0]=pktrcv[0]-pktsent[0];
		for (int i=1;i<ti;i++)
		{
			pktleft[i]=	pktleft[i-1]+pktrcv[i]-pktsent[i];
			if (pktleft[i]>n) {
				pktdrop[i]=pktleft[i]-n;
				pktleft[i]=n;
			}

		}
		for (int i=0;i<ti;i++)
		{
			System.out.print((i+1)+" \t \t "+pktrcv[i]+" \t \t"+pktsent[i]+" \t \t"+pktleft[i]+" \t \t"+pktdrop[i]+"\t \t");
			System.out.println();

		}

		
		
		
	}
}
