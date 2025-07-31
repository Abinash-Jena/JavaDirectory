package O12_STRING_HANDELING;

public class StringOperationsExample {
    public static void main(String[] args) {
        /* */ String name = "Satya Sagar";
        int length = name.length(); // Find the length
        System.out.println(length);
        String str = " is Teacher";
        System.out.println(name + str); // Concadination
        System.out.println(name.concat(str)); // Concadination Method
        Integer num = 10;
        String s = num.toString(num); // toString Method
        System.out.println(s);
        String t = String.valueOf(3.141); // String.valueOf Method
        System.out.println(t);
        System.out.println(name.charAt(6));
        char[] c = new char[4];
        name.getChars(1, 5, c, 0);
        System.out.println(c);
        byte[] b = name.getBytes();
        for (byte val : b) {
            System.out.print(val + " ");
        }
        char[] c1 = name.toCharArray();
        for (char val : c1) {
            System.out.print(val + " ");
        }
    }
}