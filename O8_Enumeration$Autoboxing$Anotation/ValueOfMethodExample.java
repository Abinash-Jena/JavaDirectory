package O8_ENUMERATION$AUTOBOXING$ANOTATION;
enum CacCourses 
{
    JAVA , FSD ,EH
}

public class ValueOfMethodExample {
    public static void main(String[] args) {
        CacCourses cc = CacCourses.valueOf("FSD");
        System.out.println(cc);
    }
}
