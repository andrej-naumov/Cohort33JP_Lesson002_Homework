package app.startup;

import app.startup.employees.Designer;
import app.startup.employees.Programmer;
import app.startup.employees.Tester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TechnicalFounder {

    private final Designer designer;
    private final Programmer programmer;
    private final Tester tester;

    @Autowired
    public TechnicalFounder(Designer designer, Programmer programmer, Tester tester) {
        this.designer = designer;
        this.programmer = programmer;
        this.tester = tester;
    }

    public void work() {
        System.out.println("Я отвечаю за техническую часть проекта");
        designer.work();
        programmer.work();
        tester.work();
    }
}
