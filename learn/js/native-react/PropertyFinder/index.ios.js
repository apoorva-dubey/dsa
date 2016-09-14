'use strict';

import React, { Component } from 'react';
import {
AppRegistry,
StyleSheet,
NavigatorIOS,
Text
} from 'react-native';

var SearchPage = require('./SearchPage');

var styles = StyleSheet.create({
  container: {
    flex: 1
  }
});

class PropertyFinderApp extends Component {
  render() {
    return (
      <NavigatorIOS
        style={styles.container}
        initialRoute={{
          title: 'Property Finder',
          component: SearchPage,
        }}/>
    );
  }
}

AppRegistry.registerComponent('PropertyFinder', function() { return PropertyFinderApp });
