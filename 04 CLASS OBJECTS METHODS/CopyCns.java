public class CopyCns {
    String name;

    CopyCns(String n) {
        name = n;
    }

    CopyCns(CopyCns c) {
        name = c.name;
    }

    public static void main(String[] args) {
        CopyCns cc = new CopyCns("abinash");
        System.out.println(cc.name);
    }
}
