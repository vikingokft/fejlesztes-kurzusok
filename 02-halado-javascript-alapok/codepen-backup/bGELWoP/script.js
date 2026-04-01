function logUntilSmall (array) {
 var condition = " pozitív";
 var error = " megállította a logolást";
 for (var i = 0; i < array.length && array[i] > 0; i++) {
 console.log(array[i] + condition);
 }
 if (i === array.length) {
 var message = "minden elem" + condition;
 } else {
 var message = array[i] + error;
 }
 console.log(message);
}

var testArray = [1, 3, 4, 7, 10, 11, 2];
logUntilSmall(testArray);
testArray.push(-1);
logUntilSmall(testArray);