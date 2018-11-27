import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;


/*1) create a listen socket
2) in an _INFINITE_ while loop accept a client connection
3) read the request from the client
4) reply with the correct response message
5) wait for the next client to connect*/


public class Server {
	public static void main(String[] args) throws IOException{


		ServerSocket serverSocket = new ServerSocket(ProtocolData.port);

		while(true) {
			Socket socket = serverSocket.accept();
			// the rest of the protocol goes here

			DataInputStream in = new DataInputStream(socket.getInputStream());

			int a = in.readInt();
			System.out.println("a is: " + a);
			int b = in.readInt();
			System.out.println("b is: " + b);
			maxOfTwo(a,b);
			
		}

	}

	static void maxOfTwo(int a, int b) {
		if(a > b) {
			System.out.println(a + " is the greater number");
		}
		else {
			System.out.println(b + " is the greater number");
		}
	}


}
