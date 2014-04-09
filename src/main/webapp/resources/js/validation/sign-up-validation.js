var passedColor = "#01FE10";
var failedColor = "#FF0000";
var minLoginLength = 5;
var minPasswordLength = 6;
var emailEnable = false;
var loginEnable = false;
var passwordEnable = false;
// var submitButtonEnable = false;

function validateEmail() {
	var inputField = document.getElementById("email");
	var regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	if (!regex.test(inputField.value)) {
		inputField.style.backgroundColor = failedColor;
		emailEnable = false;
	} else {
		inputField.style.backgroundColor = passedColor;
		emailEnable = true;
	}
	checkEnableSubmit();
}

function validateLogin() {
	var inputField = document.getElementById("login");
	if (inputField.value.length <= minLoginLength) {
		inputField.style.backgroundColor = failedColor;
		loginEnable = false;
	} else {
		inputField.style.backgroundColor = passedColor;
		loginEnable = true;
	}
	checkEnableSubmit();
}

function validatePassword() {
	var inputFieldPassword = document.getElementById("password");
	var inputFieldPasswordRepeat = document.getElementById("passwordRepeat");
	if (inputFieldPassword.value.length <= minPasswordLength) {
		inputFieldPassword.style.backgroundColor = failedColor;
		passwordEnable = false;
	} else {
		inputFieldPassword.style.backgroundColor = passedColor;
	}
	if (inputFieldPasswordRepeat.value.length > 0
			&& inputFieldPasswordRepeat.value != inputFieldPassword.value) {
		inputFieldPasswordRepeat.style.backgroundColor = failedColor;
	} else if (inputFieldPasswordRepeat.value.length > 0
			&& inputFieldPasswordRepeat.value == inputFieldPassword.value) {
		inputFieldPasswordRepeat.style.backgroundColor = passedColor;
		passwordEnable = true;
	}
	checkEnableSubmit();
};

function checkEnableSubmit() {
	var submitButton = document.getElementById("signUpButton");
	if (emailEnable != true || loginEnable != true || passwordEnable != true) {
		submitButton.disabled = false;
	} else {
		submitButton.disabled = true;
	}
}
