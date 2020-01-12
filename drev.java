import java.util.*;
class drev{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,3,45,6,7,8,7,2,2};
        int n=a.length;
        int []temp=new int [100];
        int j=0;
        for (int i=0;i<n;i++){
            if (a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
            
        }
        temp[j++]=a[n-1];
        for(int i=0;i<j;i++){
            a[i]=temp[i];
        }
        for(int i=0;i<j;i++){
            System.out.println(a[i]);
        }

        
    }

}