let readMore = 1;

$(document).ready(function(){
    $('#btn-read-more').click(function(){
        var content = document.getElementById('description-body').innerText;
        console.log(content);
        if(readMore === 1){
            $('#description-body').text("");
            $('#btn-read-more').text('Hide>>');
            readMore = 2;
        }
        else{
            $('#description-body').text("jalfsjlajflsjlfjlsajflsjdlfs");
            $('#btn-read-more').text('Read more about>>');
            readMore = 1;
        }
    });
})

$(document).ready(function(){
    var content = document.getElementById('description-body').innerText;
    $('#description-body').html(content);
})

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
            dataType: "JSON",
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
