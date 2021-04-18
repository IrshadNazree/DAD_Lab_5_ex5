import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
public static void main(String[] args) {
		
		final int serverPort=50001;
		int bufferSize = 1024;
		
		try {
		    DatagramSocket sc = new DatagramSocket(50001);
		    byte[] inData = new byte[bufferSize];
		    
		    DatagramPacket inputPacket = new DatagramPacket(inData,inData.length);
		    System.out.println("Ready to receive connection... ");
		    sc.receive(inputPacket);
		    
		    String data = new String(inputPacket.getData());
		    System.out.println("Data from the client: " + data);
		    sc.close();
		      
		} catch (Exception ex) {
			
			System.out.println("Durian Tunggal... we got problem");
			ex.printStackTrace();
		}
		
		System.out.println("\nProgram at server-side ends");

	}
}
