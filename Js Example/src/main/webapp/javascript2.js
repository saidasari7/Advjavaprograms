 /* var num1=parseInt(prompt("Enter first number"));
   var num2=parseInt(prompt("Enter second number"));
   if(num1 > num2)
   {
	   alert("Bigset number..."+num1);
   }
   else{
	   alert("Bigset numbe"+num2);
   }*/
   
   // Assuming user input is in lowercase for simplicity
let userDay = prompt("Enter a day of the week:").toLowerCase();

switch (userDay) {
    case "monday":
        document.writeln("Mondays are bad.");
        break;
    case "tuesday":
    case "wednesday":
    case "thursday":
        document.write("Mid days are okay.");
        break;
    case "friday":
         document.write("Fridays are better.");
        break;
    case "saturday":
    case "sunday":
         document.write("Weekends are party days.");
        break;
    default:
         document.write("Invalid day input.");
}