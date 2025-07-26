package O8_Enumeration$Autoboxing$Anotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String author();
}                                                               
public class Retaintionreflectz {
    @Info(author = "Satya Sagar Sahoo")
    public void show() {
        System.out.println("CAC BBSR");
    }
    public static void main(String[] args) throws Exception {
        Method method = Retaintionreflectz.class.getMethod("show");
        if (method.isAnnotationPresent(Info.class)) {
            Info info = method.getAnnotation(Info.class);
            System.out.println("MR./Ms: " + info.author());
        }
    }
}
