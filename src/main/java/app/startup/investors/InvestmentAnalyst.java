package app.startup.investors;

import org.springframework.stereotype.Component;

@Component
public class InvestmentAnalyst {

    public void work() {
        System.out.println("Сотрудник который проводит анализ инвестиций -> Я анализирую инвестиционные возможности");
    }
}
