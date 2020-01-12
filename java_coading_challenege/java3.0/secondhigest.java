import java.util.Scanner;
class secondhigest{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int fir,sec;
        fir=sec=0;
        int arr[]={12,34,55,66,7,8,99};
        for (int i=0;i<arr.length;i++){
            if(arr[i]>fir){
                sec=fir;
                fir=arr[i];
    
            }
            else if(arr[i]>sec&&arr[i]!=fir){
                sec=arr[i];
            }
        }
        System.out.println(sec);


    }
}