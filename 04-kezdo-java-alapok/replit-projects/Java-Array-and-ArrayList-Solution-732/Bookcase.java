import java.util.ArrayList;

class Bookcase {

int numberOfShelves;

double initialLoadCapacity;

ArrayList<Shelf> shelves;

public Bookcase(int numberOfShelves, double initialLoadCapacity) {

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

void printBookcaseState() {

for(int i = this.numberOfShelves - 1; i >= 0; i--) {

System.out.print((i + 1) + ". polc: ");

this.shelves.get(i).printShelfState();

}

}

}