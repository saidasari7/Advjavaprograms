function great()
{
	document.write("Good moring sai <br>");
}
function add(num1,num2)
{
	let res;
	res=num1+num2;
	document.write("Addtion.."+res+"<br>")
}
  function billcalc(name,price,quntity)
      {
		  let totalbill;
		  totalbill=price*quntity;
		  return totalbill
	  }
  
   great()
   add(10,20)
   let bill=billcalc("sugar",50,5);
   document.write("your bill"+bill+"<br>")