

let limit = 8;
let stop = false;
let is_busy = false;

$(document).ready(function(e){
    loadProperties(limit);
});

function loadProperties(limit){
    limit++;

    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: window.location + "properties",
        data: {
            limit: limit
        },
        dataType: "json",
        cache: false,
        timeout: 4000,
        success: function (result) {
            var html = '';
            var des = '';
            $.each(result, function (key, item) {
                    if(key === limit - 1){
                        return false;
                    }
                    des = item['description'];
                    html += '<div class="col-lg-3 col-md-4 col-6 home-detail">';
                    html += '<div class="grib-home">';
                    html += '<div class="img-content">';
                    html += '<a href="/rooms/detail/';
                    html += item['propertyId'];
                    html += '">';
                    html += '<img class="img-fluid img-thumbnail" src="';
                    html += item['imageDefault'];
                    html += '" alt="Image House">';
                    html += '</a>';
                    html += '</div>';
                    html += '</div>';
                    html += '<div style="width:100%;" class="home-discription">';
                    html += '<h6>';
                    html += item['houseType'] + ' - ' + item['bedRooms'] + ' bed';
                    html += '</h6>';
                    html += '<h5 style="font-weight: bold;">';
                    html += item['name'];
                    html += '</h5>';
                    html += '<h6>';
                    html += '$' + item['price'];
                    html += '</h6>';
                    html += '<h6 style="font-weight: bold;">Description</h6>';
                    html += '<p>';
                    html += des.substring(0, 100) + "...";
                    html += '</p>';
                    html += '</div>';
                    html += '</div>';
            })
    
            $('#thumbnail-homes').html(html);

            if(result.length < limit){
                stop = true;
            }
        },
        error: function (e) {
            console.log("ERROR: ", e);
        }
    });
};


$(document).ready(function(){
    $(window).scroll(function(){
        if($(window).scrollTop() + $(window).height() > $(document).height()-1){
                if(stop !== true){
                    limit+=8;
                    loadProperties(limit);
                }
        }
    });
});


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
        $('#btn-user').show();
        $('#btn-logout').show();
    }
});



$('#btn-login-modal').click(function () {

    if ($('#email-login').val() === '' && $('#password-login').val() === '') {
        $("#email-error").text("Enter email!");
        $("#password-error").text("Enter password!");
    } else if ($('#password-login').val() === '' && $('#email-login').val() !== '') {
        $("#email-error").text("");
        $("#password-error").text("Enter password!");
    } else if ($('#email-login').val() === '' && $('#password-login').val() !== '') {
        $("#password-error").text("");
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
        console.log(dataJson);

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: window.location + "signin",
            data: dataJson,
            dataType: "json",
            cache: false,
            timeout: 2000,
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
        timeout: 10000,
        success: function(response){
            $('#modal-addhouse').modal('hide');
            loadProperties();
        },
        error: function(e){
            console.log(e);
        }
    });
});

$('#for-lease').click(function(){
    window.location.href = ('/forlease');
    $(document).ready(function(){
        loadProperties();
    });
});










