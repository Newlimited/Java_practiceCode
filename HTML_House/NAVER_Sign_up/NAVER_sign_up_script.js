const idInput = document.getElementById('id');
const idMessage = document.getElementById('idMsg');
const passwordInput = document.getElementById('pswd1');
const passwordMessage = document.getElementById('pswd1Msg');
const password2Input = document.getElementById('pswd2');
const password2Message = document.getElementById('pswd2Msg');
const nameInput = document.getElementById('name');
const nameMessage = document.getElementById('nameMsg');
const birthInput = document.getElementById('yy');
const birthdayMessage = document.getElementById('birthdayMsg');
const genderSelect = document.getElementById('gender');
const genderMessage = document.getElementById('genderMsg');


function showHiddenMessage(inputElement, messageElement) {
  if (!inputElement.value) {
    messageElement.style.display = 'block';
  } else {
    messageElement.style.display = 'none';
  }
}
function selecetMsg() {
if(genderSelect.value === ""){
    genderMessage.style.display = 'block';
  } else {
    genderMessage.style.display = 'none';
  }
}

idInput.addEventListener('blur', function() {
  showHiddenMessage(idInput, idMessage);
});

passwordInput.addEventListener('blur', function() {
  showHiddenMessage(passwordInput, passwordMessage);
});
password2Input.addEventListener('blur', function() {
  showHiddenMessage(password2Input, password2Message);
});
nameInput.addEventListener('blur', function() {
  showHiddenMessage(nameInput, nameMessage);
});
birthInput.addEventListener('blur', function() {
  showHiddenMessage(birthInput, birthdayMessage);
});

genderInput.addEventListener('change', function() {
  showHiddenMessage();
});
