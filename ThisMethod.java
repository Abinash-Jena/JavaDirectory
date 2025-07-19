public class ThisMethod {
    
    void display (String name)
    {
        System.out.println(name);
    }
    
    void show(){
        this.display("dot");
    }
    public static void main(String[] args) {
        ThisMethod m = new ThisMethod();
      m.show();
    }
}
