(function () {
 // ez most már egy lokális változó
 var greeting = "Hello ";
 // és egy lokális függvény
 function greetWithExcitement (name) {
 var excitement = "!!!";
 console.log(greeting + name + excitement);
 }
 greetWithExcitement("Berry");
})(); // azonnal meghívva