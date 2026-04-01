'page marker': function (book) {
 var pageInitial = this[book].page;
 this[book].page = prompt('Melyik oldalon tartasz az alábbi könyvben: ' + this[book].title + '?');
 if (typeof pageInitial === 'undefined') {
 alert('Jelenleg az alábbi oldalon tartasz: ' + this[book].page + ' az alábbi könyvedben: ' + this[book].title + '.');
 } else {
 alert('Jelenleg az alábbi oldalon tartasz: ' + this[book].page + ' az alábbi könyvedben: ' + this[book].title + '. Legutóbb az alábbi oldalon tartottál: ' + pageInitial + ', így ez alkalommal ' + (this[book].page - pageInitial) + ' oldalt olvastál.');
 }
}