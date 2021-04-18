import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
	private String wordEntered;
	private int wordCount;
	public int client() {
		
		final int serverPort = 50001;
		int bufferSize = 1024;
//		Client client = new Client();
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter a word");
//		String wordEntered = scn.nextLine();
		
		try {
		    DatagramSocket sc = new DatagramSocket();
		    InetAddress serverAddress = InetAddress.getByName("localhost");
		    byte outDataBuffer[] = new byte[bufferSize];
		    
		    outDataBuffer = wordEntered.getBytes();	 
		    DatagramPacket outPkt = new DatagramPacket(outDataBuffer,outDataBuffer.length, serverAddress, serverPort);
		    wordCount = outDataBuffer.length;
//		    System.out.println("Sending '" + word + "'. "+ "Size = " + outDataBuffer.length);
		    sc.send(outPkt);
		    sc.close();
	
		    
		} catch (Exception ex) {
			System.out.println("Durian Tunggal... we got problem");
			ex.printStackTrace();
		}
		return wordCount;
	}
	
	public void setWord(String wordE) {
		this.wordEntered = wordE;
	}
	
//	public String getWord() {
//		return wordEntered;
//	}
}
