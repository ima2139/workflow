<?php
include_once 'inc/Header.php';
?>
<div class="container">

    <div class="row no-gutters">
        <div class="col-12 col-sm-6 col-md-8">
            </br>
            </br>
            <h2>Create New Form</h2>
            <p>Lorem ipsum..</p>
        </div>
    </div>
    <div class="row">
        <div class="col-12 col-sm-6 col-md-8">

            <form action="next.php" method="post">
                <div class="form-group">
                    <input type="text" name="formName" placeholder="Form Name" required="required">
                </div>
            </form>
        </div>
        <div class="col-6 col-md-4">
            <button class="button">Preview</button>
            <button class="button">Export PDF</button>
            <button class="button">Save</button
        </div>
    </div>
    <div class="row">
        <div class="col-xs-6">
            <div class="card" style="width: 18rem;">
                <div class="card-header">
                    Form Components
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">Header</li>
                    <li class="list-group-item">Subheader</li>
                    <li class="list-group-item">Text Label</li>
                    <li class="list-group-item">Text Field</li>
                    <li class="list-group-item">Long Text Area</li>
                    <li class="list-group-item">Chechbox Group</li>
                    <li class="list-group-item">Radio Group</li>
                    <li class="list-group-item">Data Field</li>
                    <li class="list-group-item">Number</li>
                </ul>
            </div>
        </div>
        <div class="col-xs-6">
            <div class="card formCard" style="width: 330%; height: 95%;">
                <div class="card-body">
                    <div class="text-center">Drag field from the left here</br>or</br>
                        <a href="#" style="color: black; text-decoration: underline">Chose from templates</a></div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>