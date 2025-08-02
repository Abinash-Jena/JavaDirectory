import java.io.*;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class CacNetworkingModern {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- CAC NETWORKING MENU ---");
            System.out.println("1. Show InetAddress info");
            System.out.println("2. TCP Client (Run after server)");
            System.out.println("3. TCP Server (Run before client)");
            System.out.println("4. UDP Sender (Run after receiver)");
            System.out.println("5. UDP Receiver (Run before sender)");
            System.out.println("6. Show URL Info (https://www.cac.edu.in)");
            System.out.println("7. HttpClient Simple Read");
            System.out.println("8. HttpClient GET");
            System.out.println("9. URI Parse");
            System.out.println("10. HttpClient GET (JSON Placeholder)");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            int ch;
            try {
                ch = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 11.");
                continue;
            }

            try {
                switch (ch) {
                    case 1:
                        InetAddress inet = InetAddress.getByName("www.cac.edu.in");
                        System.out.println("Host Name: " + inet.getHostName());
                        System.out.println("Host Address: " + inet.getHostAddress());
                        break;

                    case 2:
                        try (Socket client = new Socket("localhost", 5000);
                             PrintWriter out = new PrintWriter(client.getOutputStream(), true)) {
                            out.println("Hello from TCP Client");
                            System.out.println("Message sent to TCP server.");
                        }
                        break;

                    case 3:
                        try (ServerSocket server = new ServerSocket(5000)) {
                            System.out.println("TCP Server waiting for connection on port 5000...");
                            Socket socket = server.accept();
                            try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                                String msg = br.readLine();
                                System.out.println("Received from client: " + msg);
                            }
                        }
                        break;

                    case 4:
                        try (DatagramSocket ds = new DatagramSocket()) {
                            InetAddress addr = InetAddress.getByName("localhost");
                            byte[] buf = "Hello from UDP Sender".getBytes();
                            DatagramPacket dp = new DatagramPacket(buf, buf.length, addr, 6000);
                            ds.send(dp);
                            System.out.println("UDP message sent.");
                        }
                        break;

                    case 5:
                        try (DatagramSocket dr = new DatagramSocket(6000)) {
                            byte[] rec = new byte[1024];
                            DatagramPacket rp = new DatagramPacket(rec, rec.length);
                            System.out.println("UDP Receiver waiting on port 6000...");
                            dr.receive(rp);
                            String data = new String(rp.getData(), 0, rp.getLength());
                            System.out.println("Received: " + data);
                        }
                        break;

                    case 6:
                        URL url = new URL("https://www.cac.edu.in");
                        System.out.println("Protocol: " + url.getProtocol());
                        System.out.println("Host: " + url.getHost());
                        System.out.println("Path: " + url.getPath());
                        break;

                    case 7:
                        HttpClient simpleClient = HttpClient.newHttpClient();
                        HttpRequest simpleReq = HttpRequest.newBuilder()
                                .uri(URI.create("https://www.cac.edu.in"))
                                .build();
                        HttpResponse<String> simpleRes = simpleClient.send(simpleReq, BodyHandlers.ofString());
                        System.out.println("Page Content:\n" + simpleRes.body());
                        break;

                    case 8:
                        HttpClient httpClient = HttpClient.newHttpClient();
                        HttpRequest httpReq = HttpRequest.newBuilder()
                                .uri(URI.create("https://www.cac.edu.in"))
                                .GET()
                                .build();
                        HttpResponse<String> httpRes = httpClient.send(httpReq, BodyHandlers.ofString());
                        System.out.println("Response:\n" + httpRes.body());
                        break;

                    case 9:
                        URI uri = new URI("https://www.cac.edu.in/index.html");
                        System.out.println("Scheme: " + uri.getScheme());
                        System.out.println("Host: " + uri.getHost());
                        System.out.println("Path: " + uri.getPath());
                        break;

                    case 10:
                        HttpClient jsonClient = HttpClient.newHttpClient();
                        HttpRequest jsonReq = HttpRequest.newBuilder()
                                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                                .build();
                        HttpResponse<String> jsonRes = jsonClient.send(jsonReq, BodyHandlers.ofString());
                        System.out.println(jsonRes.body());
                        break;

                    case 11:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please choose between 1 and 11.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
