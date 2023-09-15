let copyIcon = document.getElementById('copybtn');

var validateBtn = document.getElementById('validateBtn');

function clearField() {
    document.getElementById('pwdText').value = '';
}

function generatePass() {

    let range = document.getElementById('rangeInput').innerHTML;
    
    let pass = '';
    let str = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ' +
        'abcdefghijklmnopqrstuvwxyz0123456789@#$_';

    for (let i = 1; i <= range; i++) {
        let char = Math.floor(Math.random()
            * str.length + 1);
 
        pass += str.charAt(char)
    }
 
    console.log(pass);
    document.getElementById('pwdText').value = pass;
}

var copyText
function copyPwd() {
    // Get the text field
    copyText = document.getElementById("pwdText");

    // Select the text field
    copyText.select();
    copyText.setSelectionRange(0, 99999); 

    // Copy the text inside the text field
    navigator.clipboard.writeText(copyText.value);

    // Alert the copied text
    alert('Password Copied!');
}

function rangeDisplay() {
    let range = document.getElementById('rangeInput').innerHTML;
    console.log(range);
}

copyIcon.addEventListener('mouseover' , function() {
    copyIcon.style.cursor='pointer';

})

copyIcon.addEventListener('click' , function() {
    let copyText = document.getElementById("pwdText");
    copyText.select();
    copyText.setSelectionRange(0, 99999); // For mobile devices
    navigator.clipboard.writeText(copyText.value);
    alert('Password Copied!');
})


function displayText() {
    var pwd = document.getElementById('pwdText1').value;
    console.log(pwd);
    var password = /^[a-zA-Z0-9@#_]{8,16}$/
    //.log(password.test(pwd));
    if (password.test(pwd)) {
        alert("Password meets the requirements");
    } else {
        alert("Password did not meet the requirements!\nTry Again as mentioned below:\n\n1. 8 - 16 Characters\n2. Alphanumerics both Upper & Lower case\n3. Special Characters only @#_");
    }
}
