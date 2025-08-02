// package O13_Networking;

import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getByName("www.cac.edu.in");
        System.out.println(addr.getHostName());
        System.out.println(addr.getHostAddress());
    }
}
