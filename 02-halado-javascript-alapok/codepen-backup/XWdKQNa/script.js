// and attaching the alert to a list of elements
this.alertButtons.forEach((alertButton) => {
 alertButton.addEventListener("click", this.handleAlertClick);
});