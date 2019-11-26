package java_coading_challenege;
import java.util.*;
class hashset{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // iterate all the elemenst in the hashset 
        HashSet <Integer> h=new HashSet<Integer>();
        for(int i=0;i<=100;i++){
            h.add(i);
        }
        System.out.println(h);
        Iterator <Integer> n= h.iterator();
    while(n.hasNext()){
        System.out.println(n.next());
    }
    System.out.println(h.contains(1));

    }
    


}