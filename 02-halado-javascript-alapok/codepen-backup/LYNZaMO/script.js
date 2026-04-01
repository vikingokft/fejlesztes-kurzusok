const UI = {
 // properties to store DOM elements in
 colorButton: document.querySelector(".js-color"),
 alertButtons: document.querySelectorAll(".js-alert"),
 // event handlers
 handleColorClick: function () {
 this.classList.toggle("is-danger");
 },
 handleAlertClick: function () {
 alert(this.dataset.info);
 },
 // initializer function to attach event handlers
 init: function () {
 // attaching the color event handler to a single button element
 this.colorButton.addEventListener("click", this.handleColorClick);
 // and attaching the alert to a list of elements
 this.alertButtons.forEach(function(alertButton) {
 alertButton.addEventListener("click", this.handleAlertClick);
 });
 }
}
// call the UI object's initializer method to set up everything
UI.init();