package Taxes.Systems;

import Taxes.Systems.TaxSystem;

public class IncomeMinusExpenses extends TaxSystem {
    private static final int PERCENT = 15;

    public int calcTaxFor(int debit, int credit) {
        return Math.max(0, ((debit - credit) * PERCENT) / 100);
    }
}
