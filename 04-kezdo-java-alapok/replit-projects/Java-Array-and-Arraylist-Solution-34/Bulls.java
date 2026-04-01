public class Bulls {

BasketballPlayer[] players;

Bulls(BasketballPlayer[] players) {

this.players = players;

}

public void introducePlayers() {

for(int i = 0; i < this.players.length; i++) {

this.players[i].printBasketballPlayer();

}

}

}