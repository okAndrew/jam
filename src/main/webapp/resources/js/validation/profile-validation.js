var minLoginLenght = 5;
var minPasswordLenght = 6;
var oldPassword;
var emailFlag = true;
var firstNameFlag = true;
var lastNameFlag = true;
var passwordFlag = true;

$(document).ready(function() {
	document.getElementById("role").readOnly = true;
	document.getElementById("raiting").readOnly = true;
	document.getElementById("passwordRestore").readOnly = true;
	document.getElementById("changeDataUser").disabled = true;
});

window.onload = function() {
	oldPassword = document.getElementById("passwordNew").value;
};

function validateEmail() {
	var emailBlock = document.getElementById("profileEmail");

	if (!isEmailValid()) {
		emailBlock.classList.add("has-error");
		emailFlag = false;
	} else {
		emailBlock.classList.remove("has-error");
		emailFlag = true;
	}
	isEnableClickButton();
}

function validateTextField(idBlock, idChild) {
	var textBlock = document.getElementById(idBlock);
	if (!isTextFieldValid(idChild)) {
		textBlock.classList.add("has-error");
		if (idChild == 'firstName') {
			firstNameFlag = false;
		} else if (idChild == 'lastName') {
			lastNameFlag = false;
		}
	} else {
		textBlock.classList.remove("has-error");
		if (idChild == 'firstName') {
			firstNameFlag = true;
		} else if (idChild == 'lastName') {
			lastNameFlag = true;
		}
	}
	isEnableClickButton();
}

function validateGender(){
	isEnableClickButton();
}

function validatePassword() {
	var newPasswordBlock = document.getElementById("profilePasswordNew");
	var restorePasswordBlock = document
			.getElementById("profilePasswordRestore");
	var newPasswordInput = document.getElementById("passwordNew");
	var restorePasswordInput = document.getElementById("passwordRestore");

	if (newPasswordInput.value != oldPassword) {
		document.getElementById("passwordRestore").readOnly = false;
	}
	if ((newPasswordInput.value != restorePasswordInput.value)
			|| (newPasswordInput.value.length < minPasswordLenght)) {
		newPasswordBlock.classList.add("has-error");
		restorePasswordBlock.classList.add("has-error");
		passwordFlag = false;
	} else {
		newPasswordBlock.classList.remove("has-error");
		restorePasswordBlock.classList.remove("has-error");
		passwordFlag = true;
	}
	isEnableClickButton();
}

function isEmailValid() {
	var regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	if (!regex.test(document.getElementById("email").value)) {
		return false;
	} else {
		return true;
	}
}

function isTextFieldValid(idChild) {
	var regex = /^[a-zA-Z]+$/;
	if (!regex.test(document.getElementById(idChild).value)) {
		return false;
	} else {
		return true;
	}
}

function isEnableClickButton() {
	var saveButton = document.getElementById("changeDataUser");
	if (emailFlag == true && firstNameFlag == true && lastNameFlag == true
			&& passwordFlag == true) {
		saveButton.disabled = false;
	} else {
		saveButton.disabled = true;
	}
}