

$(document).ready(function(){
    var content = document.getElementById('description-body').innerText;
    $('#description-body').html(content);
})

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

$('#btn-booking').click(function(event){
    event.preventDefault();

    if(sessionStorage.getItem("id") !== null){
        var booking = {
            userId: sessionStorage.getItem("id"),
            propertiesId: $('#properties-id').text(),
            checkIn: $('#checkin-booking').val(),
            checkOut: $('#checkout-booking').val(),
            amountPaid: $('#price').text()
        }
    
    
        var dataJson = JSON.stringify(booking);
    
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/booking",
            data: dataJson,
            cache: false,
            timeout: 1000,
            success: function(){
                alert("Booking Success!");
            },
            error: function(e){
                console.log(e);
            }
            
        });
    }
    else{
        $('#modal-login').modal('show');
    }
});
