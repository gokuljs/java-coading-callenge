import java.util.*;
class dup{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur String");
        String sp=sc.nextLine();
        char []ch=sp.toCharArray();
        int flag =0;
        for(int i=0;i<sp.length();i++){
            for (int j=i+1;j<sp.length();j++){
                if (ch[i]==ch[j]){
                    flag=1;
                    System.out.println(ch[j]);

                }
                else{
                    flag=0;
                }

            }
        }
        
    }
}