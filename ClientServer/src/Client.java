import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


/*1) prompt the user for two numbers
2) create a socket and transmit the user's numbers to the server
3) read the result from the server
4) output the result to the user
5) (optionally repeat the entire process in some manner)*/


public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException{

		Scanner input = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Please enter a number: ");
		a = input.nextInt();

		System.out.println("Please enter a second number: ");
		b = input.nextInt();

		Socket socket = new Socket("localhost", ProtocolData.port);
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());

		out.writeInt(a);
		out.writeInt(b);

		socket.close();
		input.close();


	}
}




