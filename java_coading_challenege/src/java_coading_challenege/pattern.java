
// pattern generation program 
// #
// ##
// ###
// ######### ....


package java_coading_challenege;
import java.util.*;
class pattern {
    public static void main (String args []){
        Scanner sc=new Scanner(System.in);
        



        System.out.println("1:square\n2:right-angled triangle\n3:rhombus");
        System.out.println("enetr your choice");
        int y=sc.nextInt();
        if (y==1){
            System.out.println("enter the length of the string ");
            int n=sc.nextInt();
            System.out.println("enter your pattern");
            String x=sc.next();
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(x);
                }
                System.out.println();
            }
        }
        else if(y==2){
            System.out.println("printing an right angled triangle");
            System.out.println("enter the length ");
            int s=sc.nextInt();
            System.out.println("enter the patterns");
            String l=sc.next();

            // concept is to build a pyramid
            // normally outer loop handels row
            // inner loops handels columsn s
             
            for (int i=0;i<s;i++){   // tells number of rows in the  if i=1
                for (int j=0;j<=i;j++){ // tells number of columns  j j changes from 0 to 1 so insecond case it will be ##
                    System.out.print(l); // printing string 
                }
                System.out.println(" ");
            }


            

        }
        else {
            System.out.println("printing a rhombus");
            System.out.println("enter the length of the rhombus ");
            /* trying to print rhombus 
                       1
                    2     3
                4      4      6
                    7     8
                       9


            */
            int r=sc.nextInt();// entering length of the rhombus 
            int space=r-1;// number of space printed should be less than number of columns 
            // 2r number of rows are going to be printeed 
            // first print the first half of thr rhombus 
            // the print the second half of the rhombus 
            for (int i=0;i<r;i++){
                // parent loop 
                // now first print the spaces 
                for (int j=0;j<space;j++){
                    System.out.print(" ");
                }
                // now print the pattern that should be less than the parrent row 
                for (int k=0;k<i;k++){
                    System.out.print("* ");
                }
                System.out.println();
                space--;
            }
            space=0;
            for (int i=r;i>0;i--){

                // printing it in reverse order should start from zero
                for (int j=0;j<space;j++){
                    System.out.print(" ");

                }
                for (int k=0;k<i;k++){
                    System.out.print("* ");

                }
                System.out.println();
                space++;

            }
        
    }
}
}