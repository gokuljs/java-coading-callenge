package java_coading_challenege;
import java.util.Scanner;
class lapindrome{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String n=sc.nextLine();
        int l=n.length()/2;
        char[] c=n.toCharArray();
        for(int i=0;i<n.length();i++){
            System.out.println(c[i]);
        }        
        char []a=new char [100];
        char []b=new char [100];
        for (int i=0;i<l;i++){
            a[i]=c[i];
        }
        for (int i=l;i<n.length();i++){
            b[i]=c[i];
            System.out.println("b[i]"+b[i]);


        }
        System.out.println("---------------------------------");
        for(int i=0;i<l;i++){
            System.out.println(a[i]);
        }
        System.out.println("----------------------------------");
        for(int i=l;i<n.length();i++){
            System.out.println(b[i]);
        }
        int flag=0;
        for (int i=0;i<l;i++){
            for(int j=l;j<n.length();j++){
                if(a[i]==b[j]){
                    flag=1;
                }
            }
            
            

        }
        if (flag==1){
            System.out.println("its lapindrome");
        }
        else{
            System.out.println("not lapindrome");
        }


    }
}