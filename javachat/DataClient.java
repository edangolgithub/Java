import java.util.Scanner;
import java.net.Socket;
import java.io.IOException;

/**
 * A command line client for the date server. Requires the IP address of the
 * server as the sole argument. Exits after printing the response.
 */
public class DataClient {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Pass the server IP as the sole command line argument");
            return;
        }
        if(args[0].length()<1)
        {
            args[0]="localhost"; 
        }
        var socket = new Socket("127.0.0.1", 59090);
        var in = new Scanner(socket.getInputStream());
        System.out.println("Server response: " + in.nextLine());
    }
}