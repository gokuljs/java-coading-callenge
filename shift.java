import java.util.Scanner;
class shift{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);  
        int a[]={1,0,0,0,1,1,1,0};//0,1,2,3,4,5,6,7
        int n=a.length;
        int j=n-1;
        int k=0;
        int []b=new int [n];
        for(int i=0;i<n;i++){
            if (a[i]==0){
                b[k]=0;
                k++;
            }
            if(a[i]==1){
                b[j]=1;
                j--;
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}