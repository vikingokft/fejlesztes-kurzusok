const personFactory = function (name) {
 return {
 name: name,
 introduce: function() {
 console.log("Hello, a nevem " + this.name);
 },
 };
};
personFactory("Berry").introduce(); // logs "Hello, a nevem Berry"
personFactory("Henry").introduce(); // logs "Hello, a nevem Henry"
personFactory("Lenina").introduce(); // logs "Hello, a nevem Lenina"