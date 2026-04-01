handleAlertClick: function (currentButton) {
 // this is the new part - let's fill this box!
 this.messageBox.textContent = currentButton.dataset.info;
},