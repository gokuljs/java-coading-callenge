package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class udp{
    public static void main (String []args){
        try {
            DatagramSocket ds=new DatagramSocket(1244);
            byte[] buffer=new byte[100];
            String msg;
            DatagramPacket dp;
            while (true){
                dp=new DatagramPacket(buffer,buffer.length);
                ds.receive(dp);
                msg=new String(dp.getData(),dp.getOffset(),dp.getLength());
                System.out.println(msg);

            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}