package O8_Enumeration$Autoboxing$Anotation;
enum Traffic 
{
    RED , ORANGE , GREEN
}

public class EnumerateExample {
    public static void main(String[] args) {
        Traffic c = Traffic.GREEN;
        System.out.println(c.name());
        System.out.println(c.ordinal());
        System.out.println(c.toString());
    }
}
