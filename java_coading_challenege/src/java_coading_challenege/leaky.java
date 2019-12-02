package java_coading_challenege;
import java.util.*;

import javax.jws.soap.SOAPBinding.Style;
class leaky{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the bucket size");
        int n=sc.nextInt();
        System.out.println("enter the rate of flow");
        int r=sc.nextInt();
        System.out.println("enter the time interval");
        int ti=sc.nextInt();
        int time=0;
        int []pckrcv=new int [1000];
        int []pckleft=new int [1000];
        int []pckdrop=new int [1000];
        for(int i=0;i<ti;i++){
            pckrcv[i]=sc.nextInt();
        }
        int []pcksent=new int [1000];
        for(int i=0;i<ti;i++){
            if(pckrcv[i]>r){
                pcksent[i]=r;
            }
            else if(pckrcv[i]+pckleft[i]<r){
                pcksent[i]=pckrcv[i]+pckleft[i];
            }
            else if(pckrcv[i]+pckleft[i]>r){
                pcksent[i]=r;

            }
            else{
                pcksent[i]=r;

            }
        }
        pckleft[0]=pckrcv[0]-pcksent[0];
        for(int i=1;i<ti;i++){
            pckleft[i]=pckleft[i-1]+pckrcv[i]-pcksent[i];
            if(pckleft[i]>n){
                pckdrop[i]=pckleft[i]-n;
                pckleft[i]=n;
            }


        }
        System.out.println();
		System.out.println("Time \tpktreceived \tpktsent \tpktleft \tpktdropped");
		System.out.println();
        for(int i=0;i<ti;i++)
		{
			System.out.print((i+1)+" \t \t "+pckrcv[i]+" \t \t"+pcksent[i]+" \t \t"+pckleft[i]+" \t \t"+pckdrop[i]+"\t \t");
			System.out.println();

		}
    }
}

