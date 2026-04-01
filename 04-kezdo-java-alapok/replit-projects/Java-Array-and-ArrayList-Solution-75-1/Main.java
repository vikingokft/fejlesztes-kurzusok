class Main {

public static void main(String[] args) {

Bookcase bookcase = new Bookcase(2, 7);

bookcase.setUpBookcase();

String books[][] = {

{"Hófehérke és a hét törpe", "1.7"},

{"Csipkerózsika", "0.9"},

{"Pán péter", "1.2"},

{"Aladdin", "1.1"},

{"Hamupipőke", "0.8"},

{"Bambi", "0.7"},

{"Az oroszlánkirály", "1.3"},

{"A rút kiskacsa", "1.5"},

{"Micimackó", "1.2"},

{"Pocahontas", "0.8"},

{"A kis hableány", "1.3"},

{"Pinokkió", "0.6"},

};

bookcase.placeOnBookcase(books);

bookcase.printBookcaseState();

}

}