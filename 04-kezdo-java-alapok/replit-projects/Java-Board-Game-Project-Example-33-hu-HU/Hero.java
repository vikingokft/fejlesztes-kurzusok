public class Hero extends GameCharacter {

    private static final char HERO_INITIAL = 'H';
    private static final double BASE_HEALTH = 100.0;
    private static final double INSTANT_KILL = 1000.0;
    private static final double HARD_ATTACK = 10.0;
    private static final double MEDIUM_ATTACK = HARD_ATTACK * (60.0 / 100.0);
    private static final double WEAK_ATTACK = HARD_ATTACK * (30.0 / 100.0);

    public Hero(int level, int field) {
        super(BASE_HEALTH, HARD_ATTACK, new Position(level, field), HERO_INITIAL);
    }

    public void step(int field) {
        this.getPosition().setField(field);
    }

    public void changeLevel(int level) {
        this.getPosition().setLevel(level);
    }

    /*
    1) Kockadobás lementése változóba
    2) Kocka értékének kinyomtatása a konzolra
    3) Támadási erő deklarálása
    4) Támadási erő meghatározása a kockadobás értékéből
        1) Ha a dobott érték 1 vagy 2, akkor a támadási erő legyen halálos
        2) Ha a dobott érték 3 vagy 4, akkor a támadási erő legyen alap szintű
        3) Ha a dobott érték 5 vagy 6, akkor a támadási erő legyen az alap szintű támadás hatvan százaléka
        4) Ha a dobott érték 7 vagy 8, akkor a támadási erő legyen az alap szintű támadás harminc százaléka
    5) Támadási erő visszaadása
    */

    @Override
    public double attack() {
    }

}