import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanONe =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanONe.equals(beanTwo));
        Cat catBeanOne = (Cat) applicationContext.getBean("cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanOne.equals(catBeanTwo));
    }
}