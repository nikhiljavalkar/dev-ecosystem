import React, { useState } from 'react';

function App() {
  const [a, setA] = useState('');
  const [b, setB] = useState('');
  const [result, setResult] = useState(null);

  const handleOperation = async (operation) => {
    const response = await fetch(`http://localhost:8080/ntsterror/v1/${operation}?a=${a}&b=${b}`);
    const data = await response.json();
    setResult(data.result);
  };

  return (
    <div>
      <h1>Calculator</h1>
      <input type='number' value={a} onChange={(e) => setA(e.target.value)} placeholder='Enter first number' />
      <input type='number' value={b} onChange={(e) => setB(e.target.value)} placeholder='Enter second number' />
      <div>
        <button onClick={() => handleOperation('add')}>Add</button>
        <button onClick={() => handleOperation('subtarct')}>Subtract</button>
        <button onClick={() => handleOperation('multiply')}>Multiply</button>
        <button onClick={() => handleOperation('division')}>Divide</button>
      </div>
      {result !== null && <h2>Result: {result}</h2>}
    </div>
  );
}

export default App;