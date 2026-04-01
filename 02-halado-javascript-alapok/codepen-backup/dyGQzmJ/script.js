var condition = "positive";

function isPositive(number) {
 if (number > 0) {
 var message = "Yes, it's " + condition;
 }
 var fail = "No!";
 if (number < 0) {
 var message = fail;
 }
 var zero = "No, it's 0";
 console.log(message);
}

var test = 10;
isPositive(test);
test = -10;
isPositive(test);