var minLoginLength = 5;
var minPasswordLength = 6;

var X_EMAIL_LABEL = "//div[@id='sign-up-email-input']/label";
var X_LOGIN_LABEL = "//div[@id='sign-up-login-input']/label";
var X_PASSWORD_LABEL = "//div[@id='sign-up-password-input']/label";

function validateForm() {
	var checkTerms = document.getElementById('sign-up-terms-checkbox').checked;
	if (isEmailValid() == true && isLoginValid() == true && isPasswordValid() == true && checkTerms == true) {
		return true;
	} else {
		return false;
	}
}

function validateEmail() {
	var emailBlock = document.getElementById("sign-up-email-input");
	
	if (!isEmailValid()) {
		emailBlock.classList.add("has-error");
		getElementByXPath(X_EMAIL_LABEL).classList.remove("hide");
	} else {
		emailBlock.classList.remove("has-error");
		getElementByXPath(X_EMAIL_LABEL).classList.add("hide");
	}
}

function validateLogin() {
	var loginBlock = document.getElementById("sign-up-login-input");
	
	if (!isLoginValid()) {
		loginBlock.classList.add("has-error");
		getElementByXPath(X_LOGIN_LABEL).classList.remove("hide");
	} else {
		loginBlock.classList.remove("has-error");
		getElementByXPath(X_LOGIN_LABEL).classList.add("hide");
	}
}

function validatePassword() {
	var passwordBlock = document.getElementById("sign-up-password-input");
	
	if (!isPasswordValid()) {
		passwordBlock.classList.add("has-error");
		getElementByXPath(X_PASSWORD_LABEL).classList.remove("hide");
	} else {
		passwordBlock.classList.remove("has-error");
		getElementByXPath(X_PASSWORD_LABEL).classList.add("hide");
	}
};

function isEmailValid() {
	var regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	if (!regex.test(document.getElementById("email").value)) {
		return false;
	} else {
		return true;
	}
}

function isLoginValid() {
	if (document.getElementById("login").value.length <= minLoginLength) {
		return false;
	} else {
		return true;
	}
}

function isPasswordValid() {
	if (document.getElementById("password").value.length <= minPasswordLength) {
		return false;
	} else {
		return true;
	}
}

function getElementByXPath(path) {
    return document.evaluate(path, document, null, 9, null).singleNodeValue;
};