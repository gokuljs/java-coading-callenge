import java.util.Scanner;
class pali{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  number ");
        int n=sc.nextInt();
        int temp=n;
        int r;
        int sum=0;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }

        System.out.println(sum);
        if(sum==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindorme");
        }
    }
}