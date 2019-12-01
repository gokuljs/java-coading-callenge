package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class tcpclient
{
    public static void main (String args[]){
        try{
            Socket socket=new Socket("localhoast",5999);
            // socket is create an end to end connection between the machies
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            String filename=bf.readLine();
            // bufferreader is used to read contents from the file
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            dout.writeUTF(filename);
            // dataoutputtream is reading output stream into files of data
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

            
        }
        catch(IOException e){

        }
    }
}