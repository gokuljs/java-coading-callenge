import java.util.*;
class dupele{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur String");
        String sp=sc.nextLine();
        char []ch=sp.toCharArray();
        int index=0;
        int count=0;
        char [] str=new char[100];
        for (int i=0;i<sp.length;i++){
            for (int j=i+1;j<sp.length;j++){
                if(ch[i]==ch[j]){
                    break;
                }
                if (i==j){
                    str[index++]=ch[i];
                    count++;
                }


            }
        }
        for(int i=0;i<count;i++){
            System.out.println(str[i]);
        }


}
}
