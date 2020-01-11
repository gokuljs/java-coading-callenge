import java.util.Scanner;
class lapi{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String s=sc.nextLine();
        char []c=s.toCharArray();
        int n=s.length();
        int flag=0;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                for(int j=n/2;j<n;j++){
                    if (c[i]==c[j]){
                        flag=1;
                    }
                }
            }
            if(flag==1){
                System.out.println("lapindrome");
            }
            else{
                System.out.println("not lapindrome");
            }
        }
        else {
            for(int i=0;i<n/2;i++){
                for(int j=n/2+1;j<n;j++){


                    if (c[i]==c[j]){
                        flag=1;
                    }

                }

            }
            if(flag==1){
                System.out.println("lapindrome");
            }
            else{
                System.out.println("not lapindrome");
            }
        }
        

    }
}