public class Main {

public static void main(String[] args) {

String[] players = {"B. J. Armstrong", "Bill Cartwright", "Horace Grant", "Craig Hodges", "Dennis Hopson", "Michael Jordan", "Stacey King", "Cliff Levingston", "John Paxson", "Will Perdue", "Scottie Pippen", "Scott Williams"};

String lastPlayer = players[11];

Bulls bulls = new Bulls(players, lastPlayer);

System.out.println(bulls.lastPlayer);

bulls.removeInjuredPlayer(4);

System.out.println(bulls.players[4]);

String[] oppositeTeam = new String[11];

fillOppositeTeam(oppositeTeam);

System.out.println(oppositeTeam[0]);

}

public static void fillOppositeTeam(String[] oppositeTeam) {

oppositeTeam[0] = "Elden Campbell";

oppositeTeam[1] = "Vlade Divac";

oppositeTeam[2] = "Larry Drew";

oppositeTeam[3] = "A. C. Green";

oppositeTeam[4] = "Magic Johnson";

oppositeTeam[5] = "Sam Perkins";

oppositeTeam[6] = "Byron Scott";

oppositeTeam[7] = "Tony Smith";

oppositeTeam[8] = "Terry Teagle";

oppositeTeam[9] = "Irving Thomas";

oppositeTeam[10] = "Mychal Thompson";

}

}