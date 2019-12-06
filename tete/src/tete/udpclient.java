package tete;
import java.util.*;
import java.io.*;
import java.net.*;
class udpclient{
	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(1224);
			String msg;
			byte[] buffer=new byte[100];
			DatagramPacket dp;
			while(true) {
				dp=new DatagramPacket(buffer,buffer.length);
				ds.receive(dp);
				msg=new String(dp.getData(),dp.getOffset(),dp.getLength());
				System.out.println(msg);
			}
		}
		catch(Exception e) {
			
		}
		
	}
}