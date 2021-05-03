import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TransferClient {
    public static void main (String []args) {
        try {
             Socket s = new Socket("localhost", 1999);
             DataOutputStream dos = new DataOutputStream(s.getOutputStream());
             dos.writeUTF("If procrastination was a sport, I would compete in it later.");
            } catch (IOException ie) {
              ie.printStackTrace();
            }
         }
}
