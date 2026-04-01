public class Main {

    private static final int TULIP_BULBS = 5;
    private static final int HYACINTH_BULBS = 5;

    public static void main(String[] args) {
        Gardener gardener = new Gardener(TULIP_BULBS, HYACINTH_BULBS);

        for (int i = 0; i < gardener.getFlowers().size(); i++) {
            gardener.getFlowers().get(i).printFlower();
        }
    }

}