function solve() {
    var password = document.getElementById("password").value;
    var repassword = document.getElementById("repassword").value;
    var passMessage = document.getElementById("pass");
  
    if (password != repassword) {
        passMessage.innerHTML = "Passwords do not match!";
        passMessage.style.color = "red";
        return false;
    } else {
        passMessage.innerHTML = "";
        return true;
    }
}
