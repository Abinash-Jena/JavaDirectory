import java.io.*;
import java.net.*;

public class ChartServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server Started. Waiting for client...");

            Socket socket = ss.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader ui = new BufferedReader(new InputStreamReader(System.in));

            // Thread to receive messages from client
            Thread receive = new Thread(() -> {
                try {
                    String clientMessage;
                    while ((clientMessage = in.readLine()) != null) {
                        if (clientMessage.equalsIgnoreCase("stop")) {
                            System.out.println("Client ended the chat.");
                            System.exit(0);
                        }
                        System.out.println("Client: " + clientMessage);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            // Thread to send messages to client
            Thread send = new Thread(() -> {
                try {
                    String serverMessage;
                    while (true) {
                        System.out.println("Server (You): ");
                        serverMessage = ui.readLine();
                        out.println(serverMessage);
                        if (serverMessage.equalsIgnoreCase("stop")) {
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
