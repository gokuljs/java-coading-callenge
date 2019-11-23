package java_coading_challenege;
import java.util.Scanner;
class prime{
    public static void main(String args[]){
        // program to print all prime numbers one to 100
        // logic behind to check given number is prime number or not is 
        // consider 13 is number by user 
        // now 13 should be divided by every number starting from 2 to 13 
        //if reminder ==0 then its not prime number 
        Scanner sc =new Scanner(System.in);// intializing scanner class 
        System.out.println("enter until which you want to fing the prime number ");
        int n=sc.nextInt();// taking input 
        int r; // intializing reminder 
        boolean check=true; 
        String primenumbersare =" "; // creating a string where all prime numbers will be stored 
        for (int i=2;i<=n;i++){
            check=primer(i); // passing ito another prime number it will go to method primer

            if (check){
                primenumbersare=primenumbersare+i+" "; 
            }
            }
        System.out.println("prime numbers are "+primenumbersare);
        for (int i=2;i<=n;i=i+2){
            check=primer(i); // passing ito another prime number it will go to method primer
            
            if (check){
                if (i%2==0){
                    System.out.println(i);
                }
                
            }}
        }


        
        public static boolean primer(int primenumber1){
            int q;// reminder
          for(int j=2;j<=primenumber1/2;j++){ // 
               q=primenumber1%j;
               if (q==0){
                   return false;
               }
           }
            return true;


        }

        //


        
    }
