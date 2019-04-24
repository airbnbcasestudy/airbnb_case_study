let readMore = 1;

$(document).ready(function(){
    $.ajax({
        type: "GET",
        contentType: "application/json",
        url:
        data: {},
        dataType: "JSON",
        cache: false,
        timeout: 2000,
        success: function(result){

        },

        error: function(){

        }
    });
});

$('#btn-read-more').click(function(){
    if(readMore === 1){
        $('#description-body').text("jalfsjlajflsjlfjlsajflsjdlfs");
        $('#btn-read-more').text('Hide>>');
        readMore = 2;
    }
    else{
        $('#description-body').text("jalfsjlajflsjlfjlsajflsjdlfs");
        $('#btn-read-more').text('Read more about>>');
        readMore = 1;
    }
});