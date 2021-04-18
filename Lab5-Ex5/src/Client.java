import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		final int serverPort = 50001;
		int bufferSize = 1024;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a word");
		String wordEntered = scn.nextLine();
		
		try {
		    DatagramSocket sc = new DatagramSocket();
		    InetAddress serverAddress = InetAddress.getByName("localhost");
		    byte outDataBuffer[] = new byte[bufferSize];
		    
		    outDataBuffer = wordEntered.getBytes();	 
		    DatagramPacket outPkt = new DatagramPacket(outDataBuffer,outDataBuffer.length, serverAddress, serverPort);
		    
		    System.out.println("Sending '" + wordEntered + "'. "+ "Size = " + outDataBuffer.length);
		    sc.send(outPkt);
		    sc.close();
		    
		} catch (Exception ex) {
			System.out.println("Durian Tunggal... we got problem");
			ex.printStackTrace();
		}
		
		System.out.println("\nProgram at client-side ends");

	}
}
