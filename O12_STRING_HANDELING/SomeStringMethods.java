public class SomeStringMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Satya");
        sb.append(" Sahoo");
        System.out.println(sb);
        sb.insert(5, " Sagar");
        System.out.println(sb);
        sb.replace(0,17,"Java Programming");
        System.out.println(sb);
        sb.delete(0, 8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.capacity();
        System.out.println(sb);
    }
}
