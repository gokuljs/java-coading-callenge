package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class udpserver{
    public static void main(String []args){
        try {
            DatagramSocket datagramsocket=new DatagramSocket();
            InetAddress ip=InetAddress.getByName("localhoast");
            int port=1244;
            Scanner sc=new Scanner(System.in);
            String message;
            System.out.println("enter ur message");
            message=sc.nextLine();
            while(true){
                DatagramPacket dp=new DatagramPacket(message.getBytes(),message.length(),ip,port);
                if(!message.equals("quit")){
                    datagramsocket.send(dp);


                }
                else{
                    break;
                }
                message=sc.nextLine();


            }
            datagramsocket.close();


        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}