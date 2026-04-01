var condition = "positive";
var test = 10;
isPositive(test);
test = -10;
isPositive(test);

function isPositive(number) {
 var message;
 var fail = "No!";
 if (number > 0) {
 message = "Yes, it's " + condition;
 }
 if (number < 0) {
 message = fail;
 }
 console.log(message);
}