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
        else if (n==3){
            l1.special();
        }
        else if(n==4){
            l1.perfect();
        }
        else if(n==5){
            l1.happy();
        }
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
    public void special(){
        Scanner sc=new Scanner(System.in);
        //enter the special numbers 
        //special numbers are the numbers sum of the factorial of each digit is the same number
        // 145 then 1!+2!+3!=145
        System.out.println("enter the number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int fact=1;
        int r;

        while(temp!=0){
            r=temp%10;
            System.out.println("r="+r);

            for (int i=1;i<=r;i++){
                fact=fact*i;
                System.out.println(fact);
            }
            sum=sum+fact;
            temp=temp/10;
            fact=1;
            


        }
        System.out.println(sum);
        if (sum==n){
            System.out.println("it is a special number");
        }
        else{
            System.out.println("not special number ");
        }



    }
    public void perfect(){
        Scanner sc=new Scanner(System.in);
        // perfect number are the sum of divisors other than number itself is equal to perfect number 
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if (n%i==0){
                sum=sum+i;
            }

        }
        System.out.println("sum="+sum);
        if (sum==n){
            System.out.println("entered number is perfect number");
        }
        else {
            System.out.println("entered number id not perfect number");
        }




    }
    public void happy(){
        Scanner sc =new Scanner(System.in);
        //31 =3^2+1^2=10
        //then 10=1^2+0^2=1
        // if it is equal to 1 then happy number 
        System.out.println("enter the number ");
        int n=sc.nextInt();
        double temp=0;
        double r;
        double sum=0;
        while (temp!=0){
            r=temp%10;
            sum=sum+Math.pow(r,2);
            temp=temp/10;
        }
        if (sum==1){
            System.out.println("happy number");
        }
        else {
            temp=sum;
            while(temp!=0){
                r=temp%10;

            }

        }

    }
}