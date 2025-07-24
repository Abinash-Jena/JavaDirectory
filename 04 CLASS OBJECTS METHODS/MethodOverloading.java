public class MethodOverloading {
    int add(int x){
        return x;
        // System.out.println(x);
    }

    void add(int x, int y){
        System.out.println(x+y);
    }

    void add(double x, double y){
        System.out.println(x+y);
    }

    void add(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add(10.5,20.9);
        mo.add(5);
        mo.add("satya");
        mo.add(15, 20);
        System.out.println(mo.add(5));
    }
}
