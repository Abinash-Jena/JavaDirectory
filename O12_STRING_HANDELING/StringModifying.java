public class StringModifying {
    public static void main(String[] args) {
        String a = "Java";
        String b = " Programming ";
        System.out.println(a.concat(b));
        String c = a.replace('a', '_');
        System.out.println(c);
        String d = b.substring(2 , 4);
        System.out.println(d);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(b.trim());
    }
}
