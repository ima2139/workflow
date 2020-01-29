<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>WorkFlow</title>
    <link href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
    <link href="css/main1.css" rel="stylesheet" media="all">
    <link href="css/main.css" rel="stylesheet" media="all">
</head>
    
<body>
    <div class="page-wrapper p-b-50" style="margin-top: 4%;">
        <div class="wrapper wrapper--w790" style="max-width: 35%;">
            <div class="card card-5">
                <div class="card-body">
                    <form method="POST">
                        <div class="form-row" style="margin-bottom: 0;">
                            <!-- <div class="value"> -->
                                <h2 style="color: #222;">Venture Creations</h2>
                                <h4 style="color: #222;margin-bottom: 30px;">RIT Technology Business Incubator</h4>
                                <div class="form-row row row-space" style="width: 100%;">
                                    <div class="col-6" style="width: 100%;">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="username" placeholder="Email">
                                        </div>
                                    </div>
                                </div>

                                <div class="form-row row row-space" style="width: 100%;">
                                    <div class="col-6" style="width: 100%;">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="password" placeholder="Password">
                                        </div>
                                    </div>
                                </div>

                                <div class="form-row row row-space" style="width: 100%;">
                                    <div class="col-6" style="width: 100%;">
                                        <div class="input-group-desc">
                                            <input type="checkbox" name="remember_me" style="width: 25px;"> Remember me
                                        </div>
                                    </div>
                                </div> 
                            <!-- </div> -->
                        </div>
                        
                        <div>
                            <a href="#" id="myBtn" style="margin-bottom: 10px;">Forget Password?</a> <br>
                            <button class="btn btn--radius-2 btn--blue submit_btn" type="submit">Login</button>

                          
                        </div>
                    
                    </form>
                </div>
            </div>
        </div>
    </div>


<!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <form method="POST" style="padding: 5%;">
        <div class="form-row" style="margin-bottom: 30px;">
            <!-- <div class="value"> -->
                <h2 style="margin-bottom: 30px; margin-top: 30px;">Reset Password</h2>
                <div class="row row-space" style="width: 100%;">
                    <div class="col-1" style="width: 100%;">
                        <div class="input-group-desc">
                            <input class="input--style-5" type="text" name="password" placeholder="Enter your email">
                        </div>
                    </div>
                </div>
            <!-- </div> -->
        </div>
        
        
        <div>
            <button class="btn btn--radius-2 btn--green submit_btn" type="submit">Submit</button>
        </div>
    </form>
  </div>

</div>

<!-- Jquery JS-->
    
<script>
var modal = document.getElementById("myModal");
// Get the button that opens the modal
var btn = document.getElementById("myBtn");
// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];
// When the user clicks on the button, open the modal
btn.onclick = function() {
  modal.style.display = "block";
}
// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

</script>
</body>
</html>