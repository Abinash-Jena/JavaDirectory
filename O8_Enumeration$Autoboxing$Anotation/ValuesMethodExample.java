package O8_ENUMERATION$AUTOBOXING$ANOTATION;
enum CacCourses 
{
    JAVA , FSD ,EH
}

public class ValuesMethodExample {
    public static void main(String[] args) {
        for (CacCourses cc : CacCourses.values())
        {
            System.out.println(cc);
        }
    }
}
