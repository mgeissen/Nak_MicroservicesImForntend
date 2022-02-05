const HttpSimpleProxy = require('http-simple-proxy');
const httpSimpleProxy = new HttpSimpleProxy();
httpSimpleProxy.init({
    ports: {
        8080: 9000
    }
}, function (err) {
    if (err) {
        console.error('Proxy error:', err)
    }
    // listening
    console.info('http-simple-proxy started')
});
