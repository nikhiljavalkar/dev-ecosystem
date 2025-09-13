import React, { useState } from 'react';

function App() {
  const [a, setA] = useState(0);
  const [b, setB] = useState(0);
  const [result, setResult] = useState(null);

  const handleAddition = async () => {
    const response = await fetch(`http://localhost:8080/ntsterror/v1/add?a=${a}&b=${b}`);
    const data = await response.json();
    setResult(data.result);
  };

  const handleSubtraction = async () => {
    const response = await fetch(`http://localhost:8080/ntsterror/v1/subtarct?a=${a}&b=${b}`);
    const data = await response.json();
    setResult(data.result);
  };

  const handleMultiplication = async () => {
    const response = await fetch(`http://localhost:8080/ntsterror/v1/multiply?a=${a}&b=${b}`);
    const data = await response.json();
    setResult(data.result);
  };

  const handleDivision = async () => {
    const response = await fetch(`http://localhost:8080/ntsterror/v1/division?a=${a}&b=${b}`);
    const data = await response.json();
    setResult(data.result);
  };

  return (
    <div>
      <h1>Calculator</h1>
      <input type='number' value={a} onChange={(e) => setA(e.target.value)} />
      <input type='number' value={b} onChange={(e) => setB(e.target.value)} />
      <button onClick={handleAddition}>Add</button>
      <button onClick={handleSubtraction}>Subtract</button>
      <button onClick={handleMultiplication}>Multiply</button>
      <button onClick={handleDivision}>Divide</button>
      {result !== null && <h2>Result: {result}</h2>}
    </div>
  );
}

export default App;