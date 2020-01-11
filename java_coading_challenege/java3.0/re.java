import java.util.Scanner;
class re{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sum=0;
        int s=reverse(n,sum);
        System.out.println(s);

    }
    public static int reverse(int n,int sum){
        int r;
        
        int temp=n;
        r=temp%10;
        sum=sum*10+r;
        temp=temp/10;
        if(temp!=0){
            reverse(temp,sum);
        }
        return 0;
    }
}