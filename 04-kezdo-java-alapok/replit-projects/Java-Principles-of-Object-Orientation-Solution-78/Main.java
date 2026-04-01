public class Main {

    private static final int TULIP_BULBS = 5;
    private static final int HYACINTH_BULBS = 5;
    private static final int PRICE_OF_FLOWER_BULB = 99;
    private static final double PRICE_OF_WATER = 0.2;

    public static void main(String[] args) {
        Gardener gardener = new Gardener(TULIP_BULBS, HYACINTH_BULBS);
        gardener.workAWeek();
        int income = gardener.sellFlowers();

        CashFlow cashFlow = new CashFlow();
        cashFlow.calculateExpenses(TULIP_BULBS + HYACINTH_BULBS, PRICE_OF_FLOWER_BULB, gardener.getWaterUsage(), PRICE_OF_WATER);
        cashFlow.printExpenses();
        cashFlow.setIncome(income);
        cashFlow.printIncome();
        cashFlow.calculateProfit();
        cashFlow.printProfit();
    }

}