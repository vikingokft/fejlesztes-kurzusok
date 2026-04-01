const Person = function (name) {
 this.name = name;
};
Person.prototype.introduce = function() {
 console.log("Hello, a nevem " + this.name);
};
const berry = new Person("Berry");
berry.introduce(); // kiírja, hogy "Hello, a nevem Berry"
const henry = new Person("Henry");
henry.introduce(); // kiírja, hogy "Hello, a nevem Henry"