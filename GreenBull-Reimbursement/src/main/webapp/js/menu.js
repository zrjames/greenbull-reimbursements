
var str;
var uid;

window.onload = function() {
	console.log("We loaded the menu.js");
	getUserId();
	getReimbursements();
}

//not sure if this is necessary
function getUserId(){
	var xhr = new XMLHttpRequest();

	
	xhr.open("GET", "http://localhost:8080/GreenBull-Reimbursement/html/MenuJSON.do", true);
	xhr.send();
	
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			str = xhr.responseText;
			
			let user = JSON.parse(xhr.responseText);
			setValues(user);
			uid = user.id;
		}
	};
}


function getReimbursements(){
	var xhr = new XMLHttpRequest();

	
	xhr.open("GET", "http://localhost:8080/GreenBull-Reimbursement/html/MenuReimbursements.do", true);
	xhr.send();
	
	xhr.onreadystatechange = function() {
		if(xhr.readyState == 4 && xhr.status == 200){
			str = xhr.responseText;
			
			let reimbs = JSON.parse(xhr.responseText);
			
			document.getElementById("reimb").innerText = str;
		}
	};
}


function setValues(user){
	document.getElementById("empName").innerText = user.firstName + " " + user.lastName;
	//document.getElementById("type").innerHTML="The type of this user is: " + user.type;
}