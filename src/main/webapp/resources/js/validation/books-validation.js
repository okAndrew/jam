var titleFlag = false;
var descriptionFlag = false;

function replaceTitle() {
	$("#titleOutput").hide();
	$("#titleInput").show();
}

function replaseDescription() {
	$("#descriptionOutput").hide();
	$("#descriptionInput").show();
}

function validateTextField(idBlock, idChild) {
	var titleBlock = document.getElementById(idBlock);
	if (!isTextFieldValid(idChild)) {
		titleBlock.classList.add("has-error");
		if (idChild == 'titleInputField') {
			titleFlag = false;
		} else if (idChild == 'descriptionInputField') {
			descriptionFlag = false;
		}
	} else {
		titleBlock.classList.remove("has-error");
		if (idChild == 'titleInputField') {
			titleFlag = true;
		} else if (idChild == 'descriptionInputField') {
			descriptionFlag = true;
		}
	}
}

function submit() {
	if (titleFlag == true && descriptionFlag == true) {
		console.log("submit form");
		document.forms["createBook"].submit();
	}
	console.log("not submit");
}

function isTextFieldValid(idChild) {
	var regex = /^[\sa-zA-Z]+$/;
	if (!regex.test(document.getElementById(idChild).value)) {
		return false;
	} else {
		return true;
	}
}

function activeWall(id) {
	console.log(id);
	var element = document.getElementById(id);
	element.css('background-color', '#ADD8E6');
}

function deactivateWall(id) {
	var element = document.getElementById(id);
	element.css('background-color', '#ecf0f1');
}
