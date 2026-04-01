function introFunction () {
 console.log("Hi, I'm " + this.name);
}
const person = {
 name: "Berry",
 introduce: introFunction
};
introFunction();