package app.code;

import app.startup.BusinessFounder;
import app.startup.TechnicalFounder;
import app.startup.employees.Designer;
import app.startup.employees.Programmer;
import app.startup.employees.Tester;
import app.startup.investors.InvestmentAnalyst;
import app.startup.investors.InvestmentPartner;
import app.startup.investors.PrincipalInvestor;

public class Application {

    public static void main(String[] args) {
        // Создаем зависимости для BusinessFounder
        InvestmentAnalyst investmentAnalyst = new InvestmentAnalyst();
        InvestmentPartner investmentPartner = new InvestmentPartner();
        PrincipalInvestor principalInvestor = new PrincipalInvestor();

        BusinessFounder businessFounder = new BusinessFounder(investmentAnalyst, investmentPartner, principalInvestor);

        // Создаем зависимости для TechnicalFounder
        Designer designer = new Designer();
        Programmer programmer = new Programmer();
        Tester tester = new Tester();

        TechnicalFounder technicalFounder = new TechnicalFounder(designer, programmer, tester);

        // Запускаем работу учредителей
        System.out.println("Работа TechnicalFounder:");
        technicalFounder.work();

        System.out.println("\nРабота BusinessFounder:");
        businessFounder.work();
    }
}
