class CacClasses{
    String StudentName;
    public void display(){
        System.out.println("Hello Cac");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        CacClasses cc = new CacClasses();
        cc.StudentName = "Abhisek";
        System.out.println("My name is : "+cc.StudentName);
        cc.display();
    }
}
