import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.ninjaapps.events.shapes.Shape;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
         AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook();

        Shape circle = (Shape) context.getBean("circle");
        circle.draw();
    }
}
