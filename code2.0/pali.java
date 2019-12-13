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
        for(int j=l.length()-1;j>-1;j--){
            z[j]=f[j];
        }
        System.out.println(" reversed array ");
        for(int j=l.length()-1;j>-1;j--){
            System.out.println(z[j]);
        }
        int flag=0;
        for(int i=0;i<l.length();i++){
            for (int j=l.length()-1;j>-1;j--){
                if (f[i]==z[j]){
                    flag=1;
                }
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