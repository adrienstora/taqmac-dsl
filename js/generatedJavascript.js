function setCheckboxList() {
    document.getElementById("transportationListContainer").innerHTML = "<label for='bus'>Bus</label><input type='checkbox' name='bus' value='bus' id='bus'></<label><label for='metro'>Metro</label><input type='checkbox' name='metro' value='metro' id='metro'>";
}
setCheckboxList();

function createSelectDisplayMode() {
    document.getElementById("route").style.display = "none"
}
createSelectDisplayMode();

function createTimeSlots() {
    document.getElementById("timeSlotsContainer").innerHTML = '<label for=horaire"">Horaire de départ</label> <input type="time" id="timeSlotImput" name="horaire" min="09:00" max="18:00" required>';
}
createTimeSlots();