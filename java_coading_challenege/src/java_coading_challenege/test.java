package java_coading_challenege;
import java.util.Scanner;
class test{
    public static void main (String [] args){
        int r;
        for(int i =2;i<=50;i++){
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    break;
                }
                else{
                    System.out.println(i);
                }                
            }
        }

    }
} 