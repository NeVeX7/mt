import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is listening on port 1234");
            Socket socket = serverSocket.accept();
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            int number = input.readInt();
            int square = number * number;
            output.writeInt(square);

            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
