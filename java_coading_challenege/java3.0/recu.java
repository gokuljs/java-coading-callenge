import java.util.Scanner;
class recur{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the factorial");
        int n=sc.nextInt();
        int s=fact(n);
        System.out.println(s);

    }
    public static int fact(int n){
        if (n<1){
            return(1);

        }
        else{
        return(n*fact(n-1));
        }
    }
}