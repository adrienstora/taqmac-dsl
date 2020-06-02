/* eslint-disable no-unused-vars */
/* eslint-disable no-undef */
// eslint-disable-next-line no-undef
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
      if (inputVal.trim() !== '' && input.length > 2) {
        //input.value = '';
        document.getElementById('formRemoveButton').classList.add('fade');
        console.log(inputVal);
        document.getElementById('routeTextVal').textContent = '';
        document.getElementById('loader').style.display = 'block';
        document.getElementById('basicMap').style.display = 'none';
        getDeparture(inputVal);
      }
    };
}

/* eslint-disable no-undef */
// eslint-disable-next-line no-unused-vars
function getDeparture(adress) {

    var action = 'GET';
    var url = 'https://taqmac-dsl-back.herokuapp.com/geocode/autocomplete/' + adress;
    // var url = "https://nominatim.openstreetmap.org/search/' + adress + '?format=json";
    var params = null;
    var onResponseReturn = checkResponseValidityDeparture;
    doHttpRequest(action, url, params, onResponseReturn);
}
  
  function getArrival() {
  
    var action = 'GET';
    var url = 'https://taqmac-dsl-back.herokuapp.com/getArrival';
    var params = null;
    var onResponseReturn = checkResponseValidityArrival;
    doHttpRequest(action, url, params, onResponseReturn);
}
  
  function init(data) {
  
    if (document.getElementById('basicMap').innerHTML !== '') {
      document.getElementById('basicMap').innerHTML = '';
    }
  
    var map = new OpenLayers.Map('basicMap');
    var mapnik = new OpenLayers.Layer.OSM();
    map.addLayer(mapnik);
    map.setCenter(new OpenLayers.LonLat(data.lon, data.lat) // Centre de la carte
      .transform(
        new OpenLayers.Projection('EPSG:4326'), // transformation de WGS 1984
        new OpenLayers.Projection('EPSG:900913') // en projection Mercator sphérique
      ), 15 // Zoom level
    );
    document.getElementById('loader').style.display = 'none';
    document.getElementById('routeText').style.visibility = 'visible';
}
  
  function checkResponseValidityDeparture(httpRequest) {
    try {
      if (httpRequest.readyState === XMLHttpRequest.DONE) {
        onValidResponseDeparture2(httpRequest);
      }
    } catch (e) {
      console.log(e);
      document.getElementById('routeTextVal').innerText = 'Lieu non trouvé';
      document.getElementById('loader').style.display = 'none';
    }
}
  
  function checkResponseValidityArrival(httpRequest) {
    try {
      if (httpRequest.readyState === XMLHttpRequest.DONE) {
        onValidResponseArrival(httpRequest);
      }
    } catch (e) {
      console.log(e);
      document.getElementById('routeTextVal').innerText += 'Lieu non trouvé';
      document.getElementById('loader').style.display = 'none';
    }
}
  
  function onValidResponseDeparture(httpRequest) {
    if (httpRequest.status === 200) {
      var data = JSON.parse(httpRequest.responseText)[0];
      document.getElementById('routeTextVal').innerText = 'Départ : "' + data.display_name;
      document.getElementById('basicMap').style.display = 'block';
      getArrival();
      init(data);
    } else {
      document.getElementById('routeTextVal').innerText = 'Il y a eu un problème avec la requête.';
    }
}
  
function onValidResponseDeparture2(httpRequest) {
  if (httpRequest.status === 200) {
    var data = JSON.parse(httpRequest.responseText);
    var htmlContainer = document.getElementById('autocompleteList');
    var htmlToPutIn = "<div id='list'>";
    data.forEach(function(element){
      console.log(element);
      htmlToPutIn += "<div class='elem' lon='" + element.lon + "' lat='" + element.lat + "'>" + element.display_name + "</div>";
    });
    htmlToPutIn += "</div>";
    htmlContainer.innerHTML = htmlToPutIn;
    htmlContainer.style.display = "block";

  } else {
    document.getElementById('routeTextVal').innerText = 'Il y a eu un problème avec la requête.';
  }
}

function onValidResponseArrival(httpRequest) {
    if (httpRequest.status === 200) {
      // var data = httpRequest.responseText;
      document.getElementById('routeTextVal').innerText += '\nArrivée : "' + httpRequest.responseText + '"';
    } else {
      document.getElementById('routeTextVal').innerText = 'Il y a eu un problème avec la requête.';
    }
}
  

  // eslint-disable-next-line no-unused-vars
function doHttpRequest(action, url, params, onResponseReturn) {

    params = (params === null || params === undefined ? '' : params);
  
    // eslint-disable-next-line no-undef
    var httpRequest = new XMLHttpRequest();
  
    if (!httpRequest) {
      // eslint-disable-next-line no-undef
      alert('Abandon :( Impossible de créer une instance de XMLHTTP');
      return false;
    }
    httpRequest.onreadystatechange = callback;
    httpRequest.open(action, url + params);
    httpRequest.send();
  
    function callback() {
      onResponseReturn(httpRequest);
    }
}
  


showForm();

document.body.addEventListener("click", function(event) {
  console.log(event);
  if(!event.target.closest("#autocompleteList") && document.getElementById("autocompleteList")) {
    document.getElementById("autocompleteList").style.display = "none";
  } else {
    console.log(event.target);
    var data= {
      lon : parseFloat(event.target.getAttribute("lon")),
      lat : parseFloat(event.target.getAttribute("lat"))
    };
    document.getElementById('basicMap').style.display = 'block';
    document.getElementById("autocompleteList").style.display = "none";
    init(data);
  }
});

document.getElementById("formInput").addEventListener("keypress", function(event) {
  console.log(event);
  var input = document.getElementById('formInput');
  getDeparture(input.value);
  document.getElementById('formSendButton').click();
});