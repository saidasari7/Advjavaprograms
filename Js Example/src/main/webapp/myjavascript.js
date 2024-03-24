
  

/*var num1=parseInt(prompt("Enter first number"));
   var num2=parseInt(prompt("Enter second number"));
 
    var result;
    result=num1+num2;
    alert("Addition of two numbers..."+result);*/
    
    
/*/ Step 1: Store height and mass for Ratan and Anu
let heightRatan = 1.75;  
let massRatan = 70;    

let heightAnu = 1.65;    // Anu height in meters
let massAnu = 55;       // Anu mass in kilograms

// Step 2: Calculate BMIs
let BMIRatan = massRatan / (heightRatan *heightRatan);
let BMIAnu = massAnu / (heightAnu *heightAnu);


// Step 3: Log BMIs to the console
console.log("BMIRatan:", BMIRatan+"<br>");
console.log("BMIAnu:", BMIAnu);

// Step 4: Write BMIs to the browser
document.write("BMIRatan: " + BMIRatan + "<br>");
document.write("BMIAnu: " + BMIAnu + "<br>");

// Step 5: Create a boolean variable for higher BMI
let RatanHigherBMI = BMIRatan > BMIAnu;

// Log and print in the browser
console.log("Ratan has higher BMI than Anu:", RatanHigherBMI);
document.write("Ratan has higher BMI than Anu: " + RatanHigherBMI);*/


var num1=parseInt(prompt("Enter first number"));
   var num2=parseInt(prompt("Enter second number"));
 
for (let i = 1; i <=100; i++) {
  if (i % 3 === 0 && i % 5 === 0) {
    document.write("FizzBuzz");
  } else if (i % 3 === 0) {
    document.write("Fizz");
  } else if (i % 5 === 0) {
   document.write("Buzz");
  } else {
    document.write(i);
  }
}

   
   
   

