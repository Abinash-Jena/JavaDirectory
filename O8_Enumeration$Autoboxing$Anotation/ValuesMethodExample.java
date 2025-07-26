package O8_Enumeration$Autoboxing$Anotation;
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
