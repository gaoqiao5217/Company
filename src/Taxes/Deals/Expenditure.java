package Taxes.Deals;


public class Expenditure extends Deal {
    public Expenditure(String product, int price) {
        super("Покупка " + product +  " на " + price + " руб.", price, 0);
    }
}
