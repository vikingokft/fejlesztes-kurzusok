var moduleName = (function() {
 var privateVariable1 = 1;
 var privateVariable2 = 2;
 function privateFunction () {
 // csinál valamit privát változókkal
 }
 return {
 publicVariable1: "some public info",
 publicFunction1: function () {
 // csinál valamit privát változókkal, pl.
 console.log(privateVariable1);
 },
 publicFunction2: function () {
 // csinál valamit privát változókkal
 },
 }
})();
// próbáljuk ki:
moduleName.publicFunction1(); // ezt írja ki: 1