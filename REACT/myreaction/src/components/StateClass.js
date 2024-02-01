import React, { Component } from 'react';

class StateClass extends Component {
  constructor(props) {
    super(props);
    this.state = { age: 0, name: "John Doe" };
  }

  addAge = () => {
    this.setState({ age: this.state.age + 1 });
  }

  handleChange = (event) => {
    this.setState({ name: event.target.value });
  }

  render() {
    return (
      <div>
        <h1>MY AGE IS : {this.state.age} AND I AM A: {this.state.name} <button onClick={this.addAge}>ADD</button></h1>
        <input type='text' value={this.state.name} onChange={this.handleChange} />
      </div>
    );
  }
}

export default StateClass;
