public class CashFlow {

    private int flowerBulbsCost;
    private int waterCost;
    private int income;
    private int profit;

    public CashFlow() {
        this.flowerBulbsCost = 0;
        this.waterCost = 0;
        this.income = 0;
        this.profit = 0;
    }

    public int getFlowerBulbsCost() {
        return this.flowerBulbsCost;
    }

    public void setFlowerBulbsCost(int flowerBulbsCost) {
        this.flowerBulbsCost = flowerBulbsCost;
    }

    public int getWaterCost() {
        return this.waterCost;
    }

    public void setWaterCost(int waterCost) {
        this.waterCost = waterCost;
    }

    public int getIncome() {
        return this.income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getProfit() {
        return this.profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void calculateExpenses(int numberOfFlowers, int priceOfFlowerBulb, double waterUsage, double priceOfWater) {
        this.flowerBulbsCost = numberOfFlowers * priceOfFlowerBulb;
        double waterCostDouble = waterUsage * priceOfWater;
        this.waterCost = (int) waterCostDouble;
    }

    public void calculateProfit() {
        this.profit = this.income - this.flowerBulbsCost - this.waterCost;
    }

    public void printExpenses() {
        System.out.println("EXPENSES:");
        System.out.println("\t-Flower Bulbs: " + this.flowerBulbsCost + " Ft");
        System.out.println("\t-Water: " + this.waterCost + " Ft");
    }

    public void printIncome() {
        System.out.println("INCOMES:");
        System.out.println("\t-Flowers: " + this.income + " Ft");
    }

    public void printProfit() {
        System.out.println("PROFIT: " + this.profit + " Ft");
    }

}