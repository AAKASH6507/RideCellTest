function fn(){   
  var env = karate.env; // get java system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'https://api.github.com'; // a custom 'intelligent' default
  }
  var config = { // base config JSON
    appId: 'my.app.id',
    appSecret: 'my.secret',
    baseURL: 'https://api.github.com',
    anotherUrlBase: ''
  };
  /*if (env == 'stage') {
    // over-ride only those that need to be
    config.baseURL = 'Change your URL';
  } else if (env == 'e2e') {
    config.baseURL = 'Change your URL';
  }*/
  // don't waste time waiting for a connection or if servers don't respond within 5 seconds
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  karate.configure('retry', { count: 10, interval: 5000 });
  return config;
}
