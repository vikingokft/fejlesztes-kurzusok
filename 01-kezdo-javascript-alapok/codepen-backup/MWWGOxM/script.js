'page marker': function () {
 var pageInitial = this.page;
 this.page = prompt('Melyik oldalon tartasz?');
 if (typeof pageInitial === 'undefined') {
 alert('Jelenleg az alábbi oldalon tartasz: ' + this.page + ' az alábbi könyvedben: ' + this.title + '.');
 } else {
 alert('Jelenleg az alábbi oldalon tartasz: ' + this.page + ' az alábbi könyvedben: ' + this.title + '. Legutóbb az alábbi oldalon tartottál: ' + pageInitial + ', így ez alkalommal ' + (this.page - pageInitial) + ' oldalt olvastál.');
 }
}