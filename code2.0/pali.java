import java.util.Scanner;

import sun.text.normalizer.CharTrie;
class pali{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String l=sc.nextLine();
        char[] f=l.toCharArray();
        System.out.println("array");
        for(int i=0;i<l.length();i++){
        System.out.println(f[i]);
        }
        char[] z=new char[100];
        
        System.out.println(" reversed array ");
        int j=l.length();
        for (int i=0;i<l.length();i++){
            z[j-1]=f[i];
            j--;
        }
        for (int i=0;i<l.length();i++){
            System.out.println(z[i]);
        }
        int flag=0;
        for (int i=0;i<l.length();i++){
            if(z[i]==f[i]){
                flag=1;

            }

        }


        
        if (flag==1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}