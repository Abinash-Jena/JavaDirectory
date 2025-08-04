import java.io.*;
import java.net.*;

public class ChartClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to Server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader ui = new BufferedReader(new InputStreamReader(System.in));

            Thread receive = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        if (serverMessage.equalsIgnoreCase("stop")) {
                            System.out.println("Server ended the chat.");
                            System.exit(0);
                        }
                        System.out.println("Server: " + serverMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            Thread send = new Thread(() -> {
                try {
                    String clientMessage;
                    while (true) {
                        System.out.print("Client (You): ");
                        clientMessage = ui.readLine();
                        out.println(clientMessage);
                        if (clientMessage.equalsIgnoreCase("stop")) {
                            System.out.println("You ended the chat.");
                            socket.close();
                            System.exit(0);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error sending message.");
                }
            });

            receive.start();
            send.start();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
