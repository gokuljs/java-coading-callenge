
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
            String x=sc.next();
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(x);
                }
                System.out.println();
            }
        }
        
    }
}