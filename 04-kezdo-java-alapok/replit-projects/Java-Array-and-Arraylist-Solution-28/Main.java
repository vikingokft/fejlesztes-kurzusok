public class Main {

public static void main(String[] args) {

String[] players = {"B. J. Armstrong", "Bill Cartwright", "Horace Grant", "Craig Hodges", "Dennis Hopson", "Michael Jordan", "Stacey King", "Cliff Levingston", "John Paxson", "Will Perdue", "Scottie Pippen", "Scott Williams"};

String lastPlayer = players[11];

Bulls bulls = new Bulls(players, lastPlayer);

System.out.println(bulls.lastPlayer);

bulls.removeInjuredPlayer(4);

System.out.println(bulls.players[4]);

String[] oppositeTeam = new String[11];

}

}