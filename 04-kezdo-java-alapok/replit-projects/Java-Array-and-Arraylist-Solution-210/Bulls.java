public class Bulls {

String[] players;

String lastPlayer;

Bulls(String[] players, String lastPlayer) {

this.players = players;

this.lastPlayer = lastPlayer;

}

public void removeInjuredPlayer(int index) {

players[index] = "injured";

}

}