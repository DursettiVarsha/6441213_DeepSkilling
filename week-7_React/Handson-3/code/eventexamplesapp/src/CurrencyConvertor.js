import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const handleSubmit = (e) => {
    e.preventDefault();

    let result;
    if (currency === 'Euro') {
      result = parseFloat(amount) * 80; // Example: 1 Euro = ₹80
      alert(`Converting to Euro Amount is ${result}`);
    } else if (currency === 'INR') {
      result = parseFloat(amount) / 80;
      alert(`Converting to INR Amount is ${result.toFixed(2)}`);
    }
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h2 style={{ color: 'green', fontWeight: 'bold' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount: </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            required
          />
        </div>
        <br />
        <div>
          <label>Currency: </label>
          <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
            <option value="Euro">Euro</option>
            <option value="INR">INR</option>
          </select>
        </div>
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
