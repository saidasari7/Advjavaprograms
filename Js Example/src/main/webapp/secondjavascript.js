function convertDollarsToINR() {
  // Read the dollar input
  const dollarsInput = document.getElementById('dollarsInput').value;

  // Convert dollars to Indian Rupees using a fixed exchange rate
  const exchangeRate = 82.29; // Replace with the current exchange rate
  const inrAmount = parseFloat(dollarsInput) * exchangeRate;

  // Set the output to the INR output field
  document.getElementById('inrOutput').value = inrAmount.toFixed(3);
}

