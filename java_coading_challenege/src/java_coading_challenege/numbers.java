package java_coading_challenege;
import java.util.*;
import java.lang.Math;
class numbers {
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println(" 1:Amstrong number\n 2:Nivennumber \n 3:Specialnumber \n 4:perfecrnumber \n 5:Happy number\n 6:automorphic number");
        System.out.println("enter your choices");
        int n=sc.nextInt();
        numbers l1=new numbers();
        if(n==1){
            l1.amstrong();
        }
        else if (n==2){
            l1.nivien();
        }
       // else if (n==3){
          //  l1.special();
       // }
    }
    public void amstrong(){
        //to check wether entere number is amstrong number or not 
        // coinder number 153
        // amstrong number sum of cubes of 
        //153=1^3+5^3+3^3;
        //1345=
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("enter the digit ");
        n=sc.nextInt();
        System.out.println("enter the total number present in digit");
        int x=sc.nextInt();

        int temp=n;
        double sum=0;
        int r;
        while (temp!=0){
            r=temp%10;
            sum=sum+Math.pow( r, x);
            temp=temp/10;

        }
        if (sum==n){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not amstrong number");
        }
    }
    public void nivien(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  numbers");
        int n=sc.nextInt();
        //niven numbers are the numbers which are divisible by itself 
        //126 =1 +2+6=9 126%9==0
        int temp=n;
        int sum=0;
        int r;
        while(temp!=0){
            r=temp%10;
            sum=sum+r;

            temp=temp/10;

        }
        System.out.println(sum);
        if (n%sum==0){
            System.out.println("nvien number");
        }
        else {
            System.out.println("not nvien number");
        }



    }
}