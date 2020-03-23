
function showForm() {

  var input = document.getElementById('formInput');

  input.onkeyup = function(event) {
    if (event.keyCode === 13) {
      // Trigger the button element with a click
      document.getElementById('formSendButton').click();
    }

    if (input.value !== '') {
      document.getElementById('formRemoveButton').classList.remove('fade');
    } else {
      document.getElementById('formRemoveButton').classList.add('fade');
    }

  };

  document.getElementById('formRemoveButton').onclick = function() {
    input.value = '';
    document.getElementById('formRemoveButton').classList.add('fade');
  };

  document.getElementById('formSendButton').onclick = function() {
    var inputVal = input.value;
    if (inputVal.trim() !== '') {
      input.value = '';
      document.getElementById('formRemoveButton').classList.add('fade');
      console.log(inputVal);
      document.getElementById('routeTextVal').textContent = '';
      document.getElementById('loader').style.display = 'block';
      document.getElementById('basicMap').style.display = 'none';
      getDeparture(inputVal);
    }
  };
}
