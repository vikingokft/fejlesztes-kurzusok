const person = {
 name: "Berry",
 hobby: "topiary"
}
function introduce () {
 console.log("Hi, I'm " + this.name + ", and I spend my free time practicing " + this.hobby);
}
const introducePerson = introduce.bind(person);
introducePerson();