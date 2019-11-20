package java_coading_challenege;

import java.util.Scanner;
class leap{
    public static void main(String args[]){
        // program is for writing the leap year 
        // printing all the leap year from 2000 to 3000
        for (int i=2000;i<3000;i++){
            if ((i%4==0)||(i%400==0)&&(i%100!=0)){
                System.out.println("leap year"+i);

            }
            else
            {
                System.out.println("not leap year"+i);
            }
        }
    }
}