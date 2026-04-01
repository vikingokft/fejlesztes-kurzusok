var a;
function logAbsoluteUrl (url) {
 if (!a) {
 a = document.createElement('a');
 }
 a.href = url;
 console.log(a.href);
};