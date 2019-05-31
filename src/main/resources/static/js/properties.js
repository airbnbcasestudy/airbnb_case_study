$(document).ready(function () {
    $(".modal").on("hidden.bs.modal", function () {
        $("#password-login").val('').end();
        $('#email-error').text('').end();
        $('#password-error').text('').end();
        $('#login-error').text('').end();
    });
});

$(document).ready(function () {
    var email = sessionStorage.getItem('email');
    if (email == null) {
        $('#btn-user').hide();
        $('#btn-logout').hide();
    }
});


$('#btn-login-modal').click(function () {

    if ($('#email-login').val() === '' && $('#password-login').val() === '') {
        $("#email-error").text("Enter email!");
        $("#password-error").text("Enter password!");
    } else if ($('#password-login').val() === '' && $('#email-login').val() !== '') {
        $("#email-error").text("");
        $('#login-error').text("");
        $("#password-error").text("Enter password!");
    } else if ($('#email-login').val() === '' && $('#password-login').val() !== '') {
        $("#password-error").text("");
        $('#login-error').text("");
        $("#email-error").text("Enter email!");
    }
    else {
        $("#email-error").text("");
        $("#password-error").text("");
        var userSignin = {
            email: $('#email-login').val(),
            password: $('#password-login').val(),
            facebookId: ''
        }

        var dataJson = JSON.stringify(userSignin);

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/signin",
            data: dataJson,
            dataType: "json",
            cache: false,
            timeout: 1000,
            success: function (response) {
                if (response != null && response['password'] === userSignin.password) {
                    $('#modal-login').modal('hide');
                    $('#btn-signup').hide();
                    $('#btn-signin').hide();
                    $('#btn-user').text(response['firstName']);
                    $('#btn-logout').text('(Logout)');
                    $('#btn-user').show();
                    $('#btn-logout').show();
                    if (typeof (Storage) !== 'undefined') {
                        sessionStorage.setItem("email", response['email']);
                        sessionStorage.setItem("id", response['id']);
                    }
                }
                else {
                    $('#login-error').text("Email or password is incorrect");
                }
            },
            error: function (e) {
                $('#login-error').text("Email or password is incorrect");
            }
        });
    }
});


// $('#btn-login-modal').click(function(){
//     $('#form-login').validate({
//         rules:{
//             user: 'required',
//             password: 'required'
//         },
//         messages:{
//             user: 'Input',
//             password: 'input'
//         }
//     });
// });


document.addEventListener("DOMContentLoaded", function(){
    var btnUser = document.getElementById('btn-user');
    var menu = document.getElementsByClassName('user-menu');

    btnUser.onmouseover = function(){
        menu[0].style.display = "block";
    }

    btnUser.onmouseleave = function(){
        menu[0].style.display = "none";
    }
    menu[0].onmouseover = function(){
        menu[0].style.display = "block";
    }

    menu[0].onmouseleave = function(){
        menu[0].style.display = "none";
    }

},false)

$('#btn-logout').click(function () {
    if (typeof (Storage) != 'undefined') {
        sessionStorage.removeItem('email');
        sessionStorage.removeItem('id');
    }
    alert("Logout success!");

    if (sessionStorage.getItem('email') === null) {
        $('#btn-signup').show();
        $('#btn-signin').show();
        $('#btn-user').hide();
        $('#btn-logout').hide();
    }
});

$('#btn-addhouse-modal').click(function(event){
    event.preventDefault();
    var form = $('#form-addhouse')[0];
    var formData = new FormData(form);

    formData.set('editorDescription', CKEDITOR.instances['editorDescription'].getData());

    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-date',
        url: '/rooms/upload',
        contentType: false,
        processData: false,
        data: formData,
        caches: false,
        timeout: 1000,
        success: function(response){
            $('#modal-addhouse').modal('hide');
            loadProperties(limit);
        },
        error: function(e){
            console.log(e);
        }
    });
});