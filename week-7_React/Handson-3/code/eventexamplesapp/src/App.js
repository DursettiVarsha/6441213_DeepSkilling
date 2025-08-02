import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  const sayMessage = (msg) => {
    alert(`Message: ${msg}`);
  };

  const handlePress = (e) => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>React Event Handling Example</h1>

      {/* Counter with Increment and Decrement */}
      <div style={{ marginBottom: "20px" }}>
        <h2>Counter: {count}</h2>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement} style={{ marginLeft: "10px" }}>Decrement</button>
      </div>

      {/* Say Welcome Button */}
      <div style={{ marginBottom: "20px" }}>
        <button onClick={() => sayMessage("Welcome")}>Say Welcome</button>
      </div>

      {/* Synthetic Event Button */}
      <div style={{ marginBottom: "20px" }}>
        <button onClick={handlePress}>OnPress</button>
      </div>

      {/* Currency Converter Component */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
