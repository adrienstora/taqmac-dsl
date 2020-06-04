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
        document.getElementById('routeTextVal').innerText = '';
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
  
  function init(data, dataArrival) {
  
    if (document.getElementById('basicMap').innerHTML !== '') {
      document.getElementById('basicMap').innerHTML = '';
    }
  
    const iconDeparture = new ol.Feature({
      geometry: new ol.geom.Point(ol.proj.fromLonLat([data.lon,data.lat])),
      name: 'Somewhere near Nottingham',
    });


    console.log(dataArrival);
    
    const iconArrival = new ol.Feature({
      geometry: new ol.geom.Point(ol.proj.fromLonLat([dataArrival.x,dataArrival.y])),
      name: 'Somewhere near Nottingham',
    });

    
    const map = new ol.Map({
      target: 'basicMap',
      layers: [
        new ol.layer.Tile({
          source: new ol.source.OSM(),
        }),
        new ol.layer.Vector({
          source: new ol.source.Vector({
            features: [iconDeparture]
          }),
          style: new ol.style.Style({
            image: new ol.style.Icon({
              anchor: [0.5, 46],
              anchorXUnits: 'fraction',
              anchorYUnits: 'pixels',
              src: 'https://openlayers.org/en/latest/examples/data/icon.png'
            })
          })
        }),
        new ol.layer.Vector({
          source: new ol.source.Vector({
            features: [iconArrival]
          }),
          style: new ol.style.Style({
            image: new ol.style.Icon({
              anchor: [0.5, 46],
              anchorXUnits: 'fraction',
              anchorYUnits: 'pixels',
              src: 'https://openlayers.org/en/latest/examples/data/icon.png'
            })
          })
        })
      ],
      view: new ol.View({
        center: ol.proj.fromLonLat([data.lon,data.lat]),
        zoom: 15
      })
    });
    


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
      var dataArrival = getArrival();
      init(data, dataArrival);
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
      htmlToPutIn += "<div class='elem' lon='" + element.x + "' lat='" + element.y + "'>" + element.label + "</div>";
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
    document.getElementById('formInput').value = event.target.textContent;
    document.getElementById('routeTextVal').innerText = '';
    document.getElementById('basicMap').style.display = 'block';
    document.getElementById("autocompleteList").style.display = "none";
    var dataArrival = getArrival();
    init(data, dataArrival);
  }
});

document.getElementById("formInput").addEventListener("keypress", function(event) {
  console.log(event);
  var input = document.getElementById('formInput');
  getDeparture(input.value);
  document.getElementById('formSendButton').click();
});