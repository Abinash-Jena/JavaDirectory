public class GetterAndSetter {
    private int age;

    int getAge() {
        return age;
    }

    void SetAge(int a) {
        age = a;
    }

    public static void main(String[] args) {
        GetterAndSetter gs = new GetterAndSetter();
        gs.SetAge(30);
        System.out.println(gs.getAge());
    }
}
