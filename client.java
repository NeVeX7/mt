import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            output.writeInt(5);
            int square = input.readInt();

            System.out.println("Square of 5 is: " + square);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
