package Taxes.Systems;

import Taxes.Systems.TaxSystem;

public class Income extends TaxSystem {
    private static final int PERCENT = 6;

    public int calcTaxFor(int debit, int credit) {
        return Math.max(0, (debit * PERCENT) / 100);
    }
}
