<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/navBar.css">
    <link rel="stylesheet" href="css/formBuilder.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="topnav" id="topNavBar">
    <div class="brand" href="#">
        <div class="inl">Venture Creations</div>
        <div class="name">RIT Technology Business Incubator</div>
    </div>

    <div class="topnav-right">
        <div class="emptyNavItem"></div>
        <a href="#dashboard" class="nounderline">Dashboard</a>
        <a href="#forms" class="active nounderline">Forms</a>
        <a href="#admin" class="nounderline">Contact</a>
        <a href="#logout" class="nounderline">
            <div class="login">Log Out</div>
        </a>
    </div>
    <a href="javascript:void(0);" class="icon" onclick="resizeNavBar()">
        <i class="fa fa-bars"></i>
    </a>
</div>

<script>
    function resizeNavBar() {
        var x = document.getElementById("topNavBar");
        if (x.className === "topnav") {
            x.className += " responsive";
        } else {
            x.className = "topnav";
        }
    }
</script>