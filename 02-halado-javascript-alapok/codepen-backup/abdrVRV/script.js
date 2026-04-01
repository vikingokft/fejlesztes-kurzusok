var greet = (function (){
 var greeting = "Hello ";
 function greetWithExcitement (name) {
 var excitement = "!!!";
 console.log(greeting + name + excitement);
 }
 return greetWithExcitement;
})();
greet("Berry"); // kiírja, hogy "Hello Berry!!!"
console.log(greeting); // hiba, nincs itt kint greeting