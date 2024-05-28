package app.startup;

import app.startup.investors.InvestmentAnalyst;
import app.startup.investors.InvestmentPartner;
import app.startup.investors.PrincipalInvestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessFounder {

    private final InvestmentAnalyst investmentAnalyst;
    private final InvestmentPartner investmentPartner;
    private final PrincipalInvestor principalInvestor;

    @Autowired
    public BusinessFounder(InvestmentAnalyst investmentAnalyst, InvestmentPartner investmentPartner, PrincipalInvestor principalInvestor) {
        this.investmentAnalyst = investmentAnalyst;
        this.investmentPartner = investmentPartner;
        this.principalInvestor = principalInvestor;
    }

    public void work() {
        System.out.println("Я управляю бизнес-стратегией");
        investmentAnalyst.work();
        investmentPartner.work();
        principalInvestor.work();
    }
}
