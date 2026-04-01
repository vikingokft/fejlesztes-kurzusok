public class Player {

String name;

String move;

Player(String name) {

this.name = name;

}

void setMove(String move) {

this.move = move;

}

void play(Player otherPlayer) {

if (this.move.equals(otherPlayer.move)) {

System.out.println("Döntetlen!");

} else if((this.move.equals("kő") &&
otherPlayer.move.equals("papír")) ||

(this.move.equals("olló") && otherPlayer.move.equals("papír")) ||

(this.move.equals("papír") && otherPlayer.move.equals("kő"))) {

System.out.println("Nyertél " + this.name + "!");

} else {

System.out.println("Sajnos vesztettél " + this.name + " :(\n" +
otherPlayer.name + " nyert!");

}

}

}