let limit = 8;
let stop = false;
let is_busy = false;

$(document).ready(function (){
    loadProperties(limit);
})

function loadProperties(limit){
        limit++;
    
        $.ajax({
            type: "GET",
            contentType: "application/json",
            url: "/properties",
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
                        html += item['id'];
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

$('#for-lease').click(function(){
    window.location.href = ('/forlease');
    $(document).ready(function(){
        loadProperties();
    });
});