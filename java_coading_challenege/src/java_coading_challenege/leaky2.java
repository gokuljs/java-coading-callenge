package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class leaky2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bucket size");
        int n=sc.nextInt();
        System.out.println("enter rate of flow");
        int r=sc.nextInt();
        System.out.println("enter time interval");
        int ti=sc.nextInt();
        int []pktrcv=new int[100];
        int []pktleft=new int[100];
        int []pktdrop=new int[100];
        for(int i=0;i<ti;i++){
            pktrcv[i]=sc.nextInt();
        }
        int []pktsent=new int [1000];
        for(int i=0;i<ti;i++){
            if(pktrcv[i]>r)
            pktsent[i]=r;
            else if(pktsent[i]+pktleft[i]>r){
                pktsent[i]=pktrcv[i]+pktleft[i];
            }
            else if(pktsent[i]+pktleft[i]<r){
                pktsent[i]=r;
            }
            else{
                pktsent[i]=r;

            }
    
        }
        pktleft[0]=pktrcv[0]-pktsent[0];
        for(int i=1;i<ti;i++){
            pktleft[i]=pktleft[i-1]+pktrcv[i]-pktsent[i];
            if(pktleft[i]>n){
                pktdrop[i]=pktleft[i]-n;
                pktleft[i]=n;
            }

        }

        System.out.println("\tpktrcv\tpktsent\tpktleft\tpktdrop");
        for(int i=1;i<ti;i++){
            System.out.println("\t"+pktrcv[i]+"\t"+pktsent[i]+"\t"+pktleft[i]+"\t"+pktdrop[i]);

        }


        
        
        




    }
}