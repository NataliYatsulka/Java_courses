import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by nyatsulk on 9/9/17.
 */
public class Server implements Runnable {

    static private ServerSocket server;//
    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;

    public void run() {
        try {
            server = new ServerSocket(5678, 10);
            while(true){
//                connection = new Socket(InetAddress.getByName("127.0.0.1"), 5678);
                connection = server.accept();
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
//                JOptionPane.showMessageDialog(null, (String)input.readObject());
                output.writeObject("You give me:" + (String)input.readObject());
            }
        } catch (UnknownHostException e) {
        } catch (IOException e) {
        } catch (HeadlessException e){
        } catch (ClassNotFoundException e){
        }
    }
}
