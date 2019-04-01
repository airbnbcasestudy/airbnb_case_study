

$.ajax({
    type : "GET",
    contentType: "application/json",
    url : window.location + "properties",
    data: {},
    dataType: 'json',
    cache: false,
    timeout: 600000,
    success: function(result){
        var html = '';
        var id = 0;
        $.each(result, function (key, item) {
            if(id !== item['propertyId']) {
                id = item['propertyId'];
                html += '<a href="';
                html += '/rooms/detail/';
                html += item['propertyId'];
                html += '" id = "detail-ajax">';
                html += '<div class = "col-md-3">';
                html += '<div class="card" style="width: 18rem;">';
                html += '<img class="card-img-top" src="/resources/image/img1.jpg" alt="Card image cap">';
                html += '<div class="card-body">';
                html += '<h5 class="card-title">';
                html += item['name'];
                html += '</h5>';
                html += '<p class="card-text">';
                html += item['description'];
                html += '</p>';
                html += '</div>';
                html += '</div>';
                html += '</div>';
                html += '</a>';
            }
        })

        $('#property').html(html);
    },
    error : function(e) {
        console.log("ERROR: ", e);
    }
});


$.ajax({
  type : "GET",
  contentType: "application/json",
  url : window.location,
  data: {},
  dataType: 'json',
  cache: false,
  timeout: 600000,
  success: function(result){
      var html = '';
      var id = 0;
      $.each(result, function (key, item) {
          
      })
      console.log(window.location);

      $('#property').html(html);
  },
  error : function(e) {
      console.log("ERROR: ", e);
  }
});


function logwindow(){
  console.log(window.location);
}


// Open the Modal
function openModal() {
    document.getElementById('myModal').style.display = "block";
  }
  
  // Close the Modal
  function closeModal() {
    document.getElementById('myModal').style.display = "none";
  }
  
  var slideIndex = 1;
  showSlides(slideIndex);
  
  // Next/previous controls
  function plusSlides(n) {
    showSlides(slideIndex += n);
  }
  
  // Thumbnail image controls
  function currentSlide(n) {
    showSlides(slideIndex = n);
  }
  
  function showSlides(n) {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    if (n > slides.length) {slideIndex = 1}
    if (n < 1) {slideIndex = slides.length}
    for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
    }
    
    slides[slideIndex-1].style.display = "block";


  }