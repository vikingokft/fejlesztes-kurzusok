// initializer function to attach event handlers
init: function () {
 // attaching the color event handler to a single button element
 this.colorButton.addEventListener("click", this.handleColorClick);
 // and attaching the alert to a list of elements - this doesn't seem to work :(
 this.alertButtons.forEach(function(alertButton) {
 alertButton.addEventListener("click", this.handleAlertClick);
 });
}