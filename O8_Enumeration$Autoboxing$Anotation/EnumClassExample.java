package O8_ENUMERATION$AUTOBOXING$ANOTATION;
enum Level
{
 OLEVEL (3) , ALEVEL (2) , BLEVEL(1);
 int c;
 Level (int c)
 {
    this.c = c;
 }
  public int getC()
 {
    return c;
 }
}

public class EnumClassExample {
    public static void main(String[] args) {
        Level l = Level.ALEVEL;
        System.out.println(l);
        System.out.println(l.getC());
    }
}
