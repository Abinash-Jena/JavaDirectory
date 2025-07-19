public class MethodType1 {
    public int add (int x , int y)
    {
        return x+y;
    }
    public static void main(String[] args) {
        MethodType1 m1 = new MethodType1();
        int res;
        res = m1.add (10,5);
        System.out.println(res);
    }
}
