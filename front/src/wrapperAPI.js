function doHttpRequest (action, url, params, onResponseReturn) {
    
    params = (params == null || params == undefined ? "" : params);

    var httpRequest = new XMLHttpRequest();

    if (!httpRequest) {
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
