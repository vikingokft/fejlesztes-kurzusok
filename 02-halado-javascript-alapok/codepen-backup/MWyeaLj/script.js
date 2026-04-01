const person = {
 name: "Berry",
 hobbies: ["Discgolf", "Mantrailing"],
 introduce: function () {
 console.log("Hi, I'm " + this.name);
 },
 // TODO Ide írd a metódusod.
};
person.introduce(); // kiírja, hogy "Hi, I'm Berry"
person.isInterestedIn("Longform Improv"); // azt kellene kiírnia, hogy "Well, I have 2 hobbies, but Longform Improv is not one of them"
person.isInterestedIn("Discgolf"); // azt kellene kiírnia, hogy "Why yes, I love Discgolf"