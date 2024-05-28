package app.startup.employees;

import org.springframework.stereotype.Component;

@Component
public class Programmer {

    public void work() {
        System.out.println("Сотрудник программист -> Я пишу код");
    }
}
