package java_coading_challenege;
import java.util.Scanner;

class twinprime{
   public static void main (String []args){
        // program two print twin prime numbers
        Scanner sc=new Scanner(System.in);
        // twin prime numbers aare the prime numbers which 2 less or 2 more than other prime numbers 
        // consider a number 11 and 13 
        // for prime number 11 13 is twin prime number vice versa 
        twinprime obj=new twinprime();
        System.out.println("1:to find prime numbers in one range\n2:to find entered prime number is prime or not");
        int s=sc.nextInt();
        if (s==1){
            obj.twinprimecheck();

        }
        else if(s==2){
            obj.entertwinprime();
        }
        else{
            System.out.println("invalid choice");
            
        }
    }
    public void twinprimecheck(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter numbers in wat range u want to print twin bunmers ");

        int n=sc.nextInt();
        int l;
        int j;
        for (int i=1;i<n;i++){
            l=(6*i)-1;
            j=(6*i)+1;
            System.out.println("("+l+")("+j+")");
            
        }
    }
    public void entertwinprime(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("to check entere number is twin prime or not ");
        int n1=Sc.nextInt();
        int n2=Sc.nextInt();
        int l;
        int j;
        
        for (int i=1;i<n1;i++){
            l=(6*i)-1;
            j=(6*i)+1;
            if ((n1==l)&&(n2==j)){
                System.out.println("entered number is twin");
                break;
            }
            
        }

        

    }

}

