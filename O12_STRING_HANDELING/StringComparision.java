package O12_STRING_HANDELING;

public class StringComparision {
    public static void main(String[] args) {
        String str1 = "APP";
        String str2 = "APP";
        int res = str1 .compareTo(str2);
        System.out.println(res);
        System.out.println("hellow" .equalsIgnoreCase("Hellow"));
        // Region Matche s
        String str3 = "Java Programming";
        String str4 = "Programming";
        System.out.println(str3 .regionMatches(6, str4, 0, 11));
        //Startwith method
        String url = "https://www.cac.edu.in";
        System.out.println(url.startsWith("https:"));
        System.out.println(url.endsWith(".com"));
    }
}
