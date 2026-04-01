public class Main {

public static void main(String[] args) {

BasketballPlayer[] players = {

new BasketballPlayer("B. J. Armstrong", 1.88, 10),

new BasketballPlayer("Bill Cartwright", 2.16, 24),

new BasketballPlayer("Horace Grant", 2.08, 54),

new BasketballPlayer("Craig Hodges", 1.88, 14),

new BasketballPlayer("Dennis Hopson", 1.96, 2),

new BasketballPlayer("Michael Jordan", 1.98, 23),

new BasketballPlayer("Stacey King", 2.11, 34),

new BasketballPlayer("Cliff Levingston", 2.03, 53),

new BasketballPlayer("John Paxson", 1.88, 5),

new BasketballPlayer("Will Perdue", 2.13, 32),

new BasketballPlayer("Scottie Pippen", 2.01, 33),

new BasketballPlayer("Scott Williams", 2.08, 42)

};

Bulls bulls = new Bulls(players);

bulls.players[0].printBasketballPlayer();

bulls.introducePlayers();

}

}