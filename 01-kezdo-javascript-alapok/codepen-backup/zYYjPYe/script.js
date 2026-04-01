'page marker': function () {
 var pageInitial = myBook.page;
 myBook.page = prompt('Melyik oldalon tartasz?');
 alert('Jelenleg az alábbi oldalon tartasz: ' + myBook.page + ' az alábbi könyvedben: ' + myBook.title + '. Legutóbb az alábbi oldalon tartottál: ' + pageInitial + ', így ez alkalommal ' + (myBook.page - pageInitial) + ' oldalt olvastál.');
}