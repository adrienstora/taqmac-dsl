/* eslint-disable no-undef */
// eslint-disable-next-line no-unused-vars
function getDeparture(adress) {
    // DEPRECATED
    var action = 'GET';
    var url = 'https://taqmac-dsl-back.herokuapp.com/map/search/';
    // var url = "https://nominatim.openstreetmap.org/search/' + adress + '?format=json";
    var params = adress;
    var onResponseReturn = checkResponseValidityDeparture;
    doHttpRequest(action, url, params, onResponseReturn);
    //blabla
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
            onValidResponseDeparture(httpRequest);
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

function onValidResponseArrival(httpRequest) {
    if (httpRequest.status === 200) {
        // var data = httpRequest.responseText;
        document.getElementById('routeTextVal').innerText += '\nArrivée : "' + httpRequest.responseText + '"';
    } else {
        document.getElementById('routeTextVal').innerText = 'Il y a eu un problème avec la requête.';
    }
}