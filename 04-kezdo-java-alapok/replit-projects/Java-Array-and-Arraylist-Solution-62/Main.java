class Main {

public static void main(String[] args) {

char[][] randomLetters = {

{'b', 'a', 'e'},

{'t', 'r', 'o'},

{'r', 'f', 'y'}

};

for (int i = 0; i < randomLetters.length; i++) {

for (int j = 0; j < randomLetters[i].length; j++) {

if( ((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 == 1) && (j % 2 == 1))) {

System.out.println(randomLetters[i][j]);

}

}

}

}

}