/* eslint-disable no-undef */
var expect  = require('chai').expect;
var request = require('request');

it('Check if the arrival is Altran', function(done) {
    request('https://taqmac-dsl-back.herokuapp.com/getArrival' , function(error, response, body) {
        expect(response.statusCode).to.equal(200);    
        expect(body).to.equal('[{"x":1.380257,"y":43.628407,"label":"17 Avenue Didier Daurat, Blagnac, France"}]');
        done();
    });
});

it('Test OSM with "test" search', function(done) {
    request("https://taqmac-dsl-back.herokuapp.com/map/search/test", function(error, response, body) {
        var test = JSON.parse(body);
        expect(response.statusCode).to.equal(200);
        expect(test[0].display_name).to.equal("Test, Test Valley, Hampshire, South East, England, SO20 6AZ, United Kingdom");
        done();
    });
});