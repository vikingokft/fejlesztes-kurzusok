public class Main {

public static void main(String[] args) {

Player firstPlayer = new Player("Dóri");

Player secondPlayer = new Player("Marci");

firstPlayer.setMove("papír");

secondPlayer.setMove("olló");

firstPlayer.play(secondPlayer);

}

}