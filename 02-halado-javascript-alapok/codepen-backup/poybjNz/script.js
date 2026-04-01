function introFunction () {
 console.log("Hello, a nevem " + this.name);
}
const person = {
 name: "Berry",
 introduce: introFunction
};
person.introduce(); // kiírja, hogy "Hello, a nevem Berry"