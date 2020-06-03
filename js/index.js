/* eslint-disable no-undef */
// eslint-disable-next-line no-unused-vars
function getDeparture(adress) {
    document.getElementById("autocompleteList").style.display = "none";
    var action = 'GET';
    // var url = 'https://taqmac-dsl-back.herokuapp.com/geocode/autocomplete/' + adress;
    var url = "https://nominatim.openstreetmap.org/search/" + adress + "?format=json";
    var params = null;
    var onResponseReturn = checkResponseValidityDeparture;
    doHttpRequest(action, url, params, onResponseReturn);
}
  
/* eslint-disable no-undef */
// eslint-disable-next-line no-unused-vars
function getDepartureAutocomplete(adress) {

  var action = 'GET';
  var url = 'https://taqmac-dsl-back.herokuapp.com/geocode/autocomplete/' + adress;
  // var url = "https://nominatim.openstreetmap.org/search/' + adress + '?format=json";
  var params = null;
  var onResponseReturn = checkResponseValidityDepartureAutocomplete;
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
  
    var map = new ol.Map({
      target: 'basicMap',
      layers: [
        new ol.layer.Tile({
          source: new ol.source.OSM()
        })
      ],
      view: new ol.View({
        center: ol.proj.fromLonLat([data.lon, data.lat]),
        zoom: 15
      })
    });

    var layer = new ol.layer.Vector({
      source: new ol.source.Vector({
          features: [
              new ol.Feature({
                  geometry: new ol.geom.Point(ol.proj.fromLonLat([data.lon, data.lat]))
              })
          ]
      }),
      style: new ol.style.Style({
        image: new ol.style.Icon({
          anchor: [0.5, 45],
          anchorXUnits: 'fraction',
          anchorYUnits: 'fraction',
          src: './marker.png',
          scale: 0.3
        })
      })
  });
  map.addLayer(layer);

    document.getElementById('loader').style.display = 'none';
    document.getElementById('routeText').style.visibility = 'visible';
}
  
  function checkResponseValidityDeparture(httpRequest) {
    try {
      if (httpRequest.readyState === XMLHttpRequest.DONE) {
        onValidResponseDeparture(httpRequest);
      }
    } catch (e) {
      console.log(e);
      document.getElementById('routeTextVal').innerText = 'Lieu non trouvé';
      document.getElementById('loader').style.display = 'none';
    }
}

function checkResponseValidityDepartureAutocomplete(httpRequest) {
  try {
    if (httpRequest.readyState === XMLHttpRequest.DONE) {
      onValidResponseDepartureAutocomplete(httpRequest);
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
      document.getElementById('routeText').style.visibility = 'visible';
      document.getElementById('routeTextVal').innerText += 'Lieu non trouvé';
      document.getElementById('loader').style.display = 'none';
    }
}
  
  function onValidResponseDeparture(httpRequest) {
    if (httpRequest.status === 200) {
      var data = JSON.parse(httpRequest.responseText)[0];
      console.log(data);
      document.getElementById('routeTextVal').innerText = 'Départ : "' + data.display_name;
      document.getElementById('basicMap').style.display = 'block';
      getArrival();
      init(data);
    } else {
      document.getElementById('routeText').style.visibility = 'visible';
      document.getElementById('routeTextVal').innerText = 'Il y a eu un problème avec la requête.';
    }
}
  
function onValidResponseDepartureAutocomplete(httpRequest) {
  if (httpRequest.status === 200) {
    var data = JSON.parse(httpRequest.responseText);
    if(data.length > 0) {
      var htmlContainer = document.getElementById('autocompleteList');
      var htmlToPutIn = "<div id='list'>";
      data.forEach(function(element){
        console.log(element);
        htmlToPutIn += "<div class='elem' lon='" + element.x + "' lat='" + element.y + "'>" + element.label + "</div>";
      });
      htmlToPutIn += "</div>";
      htmlContainer.innerHTML = htmlToPutIn;
      htmlContainer.style.display = "block";
    }
  } else {
    document.getElementById('routeText').style.visibility = 'visible';
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


function mainFunction(event) {
  console.log(event);
  if(!event.target.closest("#autocompleteList") && document.getElementById("autocompleteList")) {
    document.getElementById("autocompleteList").style.display = "none";
    var input = document.getElementById('formInput');
    if(event.target.closest('#formSendButton')) {
      var inputVal = input.value;
      if (inputVal.trim() !== '' && inputVal.length > 2) {
        console.log(inputVal);
        if(document.getElementById('routeTextVal')) {
          document.getElementById('routeTextVal').innerText = '';
        }
        document.getElementById('loader').style.display = 'block';
        document.getElementById('basicMap').style.display = 'none';
        getDeparture(inputVal);
      }
    } else if(event.target.closest('#formRemoveButton')) {
      input.value = '';
      document.getElementById('formRemoveButton').classList.add('fade');
      document.getElementById('basicMap').style.display = 'none';
      document.getElementById('routeTextVal').innerText = '';
    }
  } else {
    console.log(event.target);
    var data= {
      lon : parseFloat(event.target.getAttribute("lon")),
      lat : parseFloat(event.target.getAttribute("lat"))
    };
    document.getElementById('formInput').value = event.target.textContent;
    if(document.getElementById('routeTextVal')) {
      document.getElementById('routeTextVal').innerText = '';
    }
    document.getElementById('basicMap').style.display = 'block';
    document.getElementById("autocompleteList").style.display = "none";
    init(data);
  }
}

document.body.addEventListener("click", function(event) {
  mainFunction(event);
});

document.getElementById("formInput").addEventListener("keydown", function(event) {
  console.log(event);
  var input = document.getElementById('formInput');
  if (event.keyCode === 13) {
    // Trigger the button element with a click
    document.getElementById('formSendButton').click();
  } else {
    if(input.value.length > 1) {
      document.getElementById("autocompleteList").style.display = "none";
      getDepartureAutocomplete(input.value);
    }
  }
  input = document.getElementById('formInput');
  if (input.value !== '') {
    document.getElementById('formRemoveButton').classList.remove('fade');
  } else {
    document.getElementById('formRemoveButton').classList.add('fade');
  }
});
