package java_coading_challenege;
import java.util.Collections;
import java.util.*;



class duplicatestring{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String ");
        String n=sc.nextLine();
        char []a=n.toCharArray();
        for (int i=0;i<n.length();i++){
            System.out.println(a[i]);
        }
        int count =0;
        System.out.println("supliacte strings");
        for (int i=0;i<n.length();i++){
            for (int j=i+1;j<n.length();j++){
                if (a[i]==a[j] && a[i]!= ' '){
                    count=count+1;
                    a[j] = '0';  // avoid printing visited characters                }

            }
        }
        if (count >1&&a[i]!='0'){
            System.out.println(a[i]);
        }


    }
    }
}