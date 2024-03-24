function convertTofahrenheit()
{
const fahrenheit=document.getElementById('fahrenheitInput').value;
// convert the farenheit to celsius 

const celsius = (parseFloat(fahrenheitInput)-32)*5/9;

document.getElementById('Celsiusoutput').value= celsius.toFixed(2);
}