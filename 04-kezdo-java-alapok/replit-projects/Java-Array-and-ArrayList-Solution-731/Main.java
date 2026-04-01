Bookcase bookcase = new Bookcase(3, 30);
bookcase.setUpShelf(0);
bookcase.setUpShelf(1);
bookcase.setUpShelf(2);

for (int i = 0; i < bookcase.shelves.size(); i++) {
 bookcase.shelves.get(i).printShelfState();
}