import java.util.ArrayList;

class Bookcase {

int numberOfShelves;

double initialLoadCapacity;

ArrayList<Shelf> shelves;

Bookcase(int numberOfShelves, double initialLoadCapacity) {

this.numberOfShelves = numberOfShelves;

this.initialLoadCapacity = initialLoadCapacity;

this.shelves = new ArrayList<>();

}

void setUpShelf(int shelfIndex) {

double loadCapacity = this.initialLoadCapacity - (this.numberOfShelves * shelfIndex);

if (loadCapacity < 1) {

System.out.println("Nem építhető fel a szekrény a megadott paraméterekkel!");

System.exit(0);

}

Shelf shelf = new Shelf(loadCapacity);

this.shelves.add(shelf);

}

void setUpBookcase() {

for(int i = 0; i < this.numberOfShelves; i++) {

setUpShelf(i);

}

}

void placeOnBookcase(String books[][]) {

for(int i = 0; i < books.length; i++) {

boolean canBePlaced = putOnShelf(books[i][0], Double.parseDouble(books[i][1]));

if(!canBePlaced) {

System.out.println(books[i][0] + " című könyv nem fért fel a polcra");

}

}

}

boolean putOnShelf(String title, double weight) {

return false;

}

void printBookcaseState() {

for(int i = this.numberOfShelves - 1; i >= 0; i--) {

System.out.print((i + 1) + ". polc: ");

this.shelves.get(i).printShelfState();

}

}

}