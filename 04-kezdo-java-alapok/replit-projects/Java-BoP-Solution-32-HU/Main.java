class Main {

public static void main(String[] args) {

int rabbitPopulation = 30;

int monthCounter = 1;

for (; monthCounter <= 6; monthCounter++) {

rabbitPopulation = rabbitPopulation * 2;

System.out.println("The number of rabbits in Skylark Valley is " +
rabbitPopulation + " by the end of month " + monthCounter);

}

for (; monthCounter <= 12; monthCounter++) {

rabbitPopulation = rabbitPopulation * 3;

System.out.println("The number of rabbits in Skylark Valley is " +
rabbitPopulation + " by the end of month " + monthCounter);

}

}

}