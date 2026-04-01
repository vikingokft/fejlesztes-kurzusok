import java.util.ArrayList;

class Shelf {

double loadCapacity;

double sumOfWeights;

ArrayList<Book> books;

Shelf(double loadCapacity) {

this.loadCapacity = loadCapacity;

this.sumOfWeights = 0;

books = new ArrayList<>();

}

void addBook(String title, double weight) {

this.sumOfWeights += weight;

Book book = new Book(title, weight);

books.add(book);

}

void printShelfState() {

System.out.println(this.loadCapacity + " kg teherbírás, aktuális teher: " + this.sumOfWeights);

}

}