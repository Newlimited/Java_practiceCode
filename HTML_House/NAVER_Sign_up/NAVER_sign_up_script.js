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
const genderInput = document.getElementById('gender')
const genderMessage = document.getElementById('genderMsg');

function showMsg(inputElement, messageElement) {
  if (!inputElement.value) {
    messageElement.style.display = 'block';
  } else {
    messageElement.style.display = 'none';
  }
}
function selecetMsg() {
  if(genderInput.value ===''){
     genderMessage.style.display = 'block';
  } else {
    genderMessage.style.display = 'none';
    return;
  }
}

passwordInput.addEventListener('blur', function() {
    showMsg(passwordInput, passwordMessage);
});
password2Input.addEventListener('blur', function() {
    showMsg(password2Input, password2Message);
});
nameInput.addEventListener('blur', function() {
    showMsg(nameInput, nameMessage);
});
birthInput.addEventListener('blur', function() {
    showMsg(birthInput, birthdayMessage);
});
genderSelect.addEventListener('click', function(){selecetMsg()});
