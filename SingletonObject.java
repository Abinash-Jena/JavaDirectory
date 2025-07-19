public class SingletonObject {
    private static SingletonObject so = new SingletonObject();
    private SingletonObject() {}
    public static SingletonObject getInstance() {
        return so;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
    public static void main(String[] args) {
        SingletonObject obj = SingletonObject.getInstance();
        obj.showMessage();
    }
}
