import java.util.Scanner;
class shift{
    public static void main (String []args){
        int a[]={1,0,0,1,1,0,0,0};
        int n=a.length;
        int count=0;
        for (int i=0;i<n;i++){
            if(a[i]!=0){
                count ++;
            }

        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            if (a[i]!=0){
                a[count]=0;
                count ++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(count);
        }

        

    }
}