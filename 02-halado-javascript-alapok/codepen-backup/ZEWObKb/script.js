function introFunction () {
 console.log("Hello, a nevem " + this.name);
 }
 const person = {
 name: "Berry",
 introduce: introFunction
 };
 introFunction(); // kiírja, hogy "Hello, a nevem undefined"