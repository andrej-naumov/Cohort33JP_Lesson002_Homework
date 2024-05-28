package app.code;

import app.startup.BusinessFounder;
import app.startup.TechnicalFounder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app.startup")
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        TechnicalFounder technicalFounder = context.getBean(TechnicalFounder.class);
        BusinessFounder businessFounder = context.getBean(BusinessFounder.class);

        // Запускаем работу учредителей
        System.out.println("Работа TechnicalFounder:");
        technicalFounder.work();

        System.out.println("\nРабота BusinessFounder:");
        businessFounder.work();
    }
}
