import java.util.Scanner;
class rev{
    public static void main (String []args){
        int a[]={1,2,3,4,5,6,7,8,9};
        int n=a.length;
        int i=0;
        int j=n-1;
        int temp=0;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }
        for(int k=0;k<n;k++){
            System.out.println(a[k]);
        }
        
    }
}