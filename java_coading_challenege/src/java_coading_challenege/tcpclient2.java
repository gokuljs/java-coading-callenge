package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class tcpclient2{
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhoast",5999);
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            String filename=bf.readLine();
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            dout.writeUTF(filename);
            DataInputStream din=new DataInputStream(socket.getInputStream());
            String content;
            do{
                content=din.readUTF();
                System.out.println(content);
                dout.flush();
                if(content==null){
                    break;
                }
            }while(true);
            dout.close();
            bf.close();
            socket.close();

            
        } catch(IOException e) {
            //TODO: handle exception
        }
    }
}