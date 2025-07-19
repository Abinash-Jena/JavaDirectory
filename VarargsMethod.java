public class VarargsMethod {
    void printsnames (String ... name)
    {
        for ( String n:name)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        VarargsMethod s = new VarargsMethod();
        s.printsnames("satya","abhinash","java");
    }
}
