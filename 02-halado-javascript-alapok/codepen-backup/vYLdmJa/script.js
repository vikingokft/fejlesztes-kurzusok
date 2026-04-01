function logUntilSmall (array) {
 for (var i=0; i < array.length && array[i] > 0; i++) {
 console.log(array[i] + " pozitív");
 }
 if (i === array.length) {
 var message = "minden elem pozitív";
 } else {
 var message = array[i] + " megállította a számolást";
 }
 console.log(message);
}

logUntilSmall([1, 3, 4, 7, -10, -1, 2]);
logUntilSmall([1, 3, 4, 7, 10, 11, 2]);