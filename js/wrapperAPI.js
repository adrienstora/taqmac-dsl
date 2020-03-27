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
