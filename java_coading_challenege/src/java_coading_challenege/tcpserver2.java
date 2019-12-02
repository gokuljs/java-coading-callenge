package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class tcpserver2{
    public static void main(String []args){
        try{
            ServerSocket ss=new ServerSocket();
            Socket socket=ss.accept();
            DataInputStream din=new DataInputStream(socket.getInputStream());
            String filename=din.readUTF();
            BufferedReader bf=new BufferedReader(new FileReader(filename));
            String content;
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            if((content=bf.readLine())!=null&&(content.length()!=0)){
                dout.writeUTF(content);

            }
            dout.close();
            socket.close();
            bf.close();
            



        }
        catch(IOException e){

        }
    }
}