const person = {
 name: "Berry",
 introduce: function() {
 console.log("Hello, a nevem " + this.name);
 },
};
person.introduce(); // logs "Hello, a nevem Berry"