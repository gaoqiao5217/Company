package Taxes;

import Taxes.Deals.Deal;
import Taxes.Systems.TaxSystem;

public class Company {
    private String title;
    private int debit = 0;
    private int credit = 0;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += amount;
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n", title, taxSystem.calcTaxFor(debit, credit));
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals){
        for (Deal deal : deals){
            debit += deal.getDebitChange();
            credit += deal.getCreditChange();
        }
        int result =  debit-credit;
        payTaxes();
        return result;
    }
}
