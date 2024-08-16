/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  TextInput,
  Text,
  View
} from 'react-native';

getInitialState = () => {
  return {
    zip: ''
  };
}

class WeatherProject extends Component {

  constructor(props) {
    super(props);
    this.state = {
      zip: '',
      forecast: null
    };
  }

  render() {
    return (
    <View style={styles.container}>

        <TextInput style={styles.input} onSubmitEditing={this._handleTextChange}/>

        <Text style={styles.welcome}>
          Welcome to React Native!
          <Text style={styles.welcome}>You input {this.state.zip}</Text>
        </Text>
        <Text style={styles.instructions}>
          To get started, edit index.ios.js
        </Text>
        <Text style={styles.instructions}>
          Press Cmd+R to reload,{'\n'}
          Cmd+D or shake for dev menu
        </Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
  input: {
    fontSize: 20,
    borderWidth: 2,
    height: 40
  },
});

AppRegistry.registerComponent('WeatherProject', () => WeatherProject);
