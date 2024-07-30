package Taxes;

import Taxes.Deals.Deal;
import Taxes.Deals.Expenditure;
import Taxes.Deals.Sale;
import Taxes.Systems.Income;
import Taxes.Systems.IncomeMinusExpenses;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("title", new Income());
        company.shiftMoney(6000);
        company.shiftMoney(-3000);
        company.payTaxes();
        company.shiftMoney(4000);
        company.shiftMoney(10000);
        company.shiftMoney(-8000);
        company.setTaxSystem(new IncomeMinusExpenses());
        company.payTaxes();

        Deal[] deals = {
                new Sale("Молоко", 200),
                new Expenditure("Рыба", 500),
                new Sale("Хлеб", 150)};
        company.shiftMoney(3000);
        System.out.println(company.applyDeals(deals));
        System.out.println(deals[0].getComment());


    }
}
