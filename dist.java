import java.util.HashMap;
import java.util.Scanner;
class dist{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int [100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> a1 = new HashMap<Integer,Integer>(); 
        for(int i=0;i<n;i++){
            a1.put(a[i],i);
        }
        System.out.println(a1.keySet()); 
        

    }
}