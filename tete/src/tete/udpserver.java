package tete;
import java.util.*;
import java.io.*;
import java.net.*;
class udpserver{
	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket();
			Scanner sc=new Scanner(System.in);
			int port=1224;
			InetAddress ip=InetAddress.getByName("localhost");
			String message=sc.nextLine();
			while(true) {
				DatagramPacket dp=new DatagramPacket(message.getBytes(),message.length(),ip,port);
				if(!message.equals("quit")) {
					ds.send(dp);
				}
				else {
					break;
				}
				message=sc.nextLine();
			}
		}
		catch(Exception e) {
			
		}
		
	}
}