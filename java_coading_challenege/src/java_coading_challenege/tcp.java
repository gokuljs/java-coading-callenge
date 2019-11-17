package java_coading_challenege;
import java.util.*;
import java.net.*;
import java.io.*;
class tcp{
	public static void main(String []args) {
		try {
			socket socket=new socket("localhoast",4555);
			BufferReader bufferReader=new BufferReader(new InputstreamReader(System.in));
			System.out.println("e");
		}
	}
}