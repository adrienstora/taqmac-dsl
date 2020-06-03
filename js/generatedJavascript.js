function setCheckboxList(){
 			document.getElementById("transportationListContainer").innerHTML = "<div><label for='bus'>Bus</label><input type='checkbox' name='bus' value='bus' id='bus'></div><div><label for='metro'>Metro</label><input type='checkbox' name='metro' value='metro' id='metro'></div>";
}
setCheckboxList();
function createSelectDisplayMode(){
	document.getElementById("route").style.display = "none"
}
createSelectDisplayMode();
function createTimeSlots(){	 
	document.getElementById("timeSlotsContainer").innerHTML = '<input type="time" id="timeSlotImput" min="09:00" max="18:00" required>';
}
createTimeSlots();
