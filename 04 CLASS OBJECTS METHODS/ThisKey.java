public class ThisKey {
    String name;
    ThisKey (String name)
    {
        this.name = name;
    }
    public static void main(String[] args) {
        ThisKey t = new ThisKey("satya");
        System.out.println(t.name);
    }
}
