<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SheffSurgeries | Home Page</title>
    <asset:stylesheet src="receptionist.css"/>
</head>
<body>
    <div id="content" role="main">
        <div class="row">
            <div class="patients">
                <h3> Patient Management </h3>
                <p></p>
                <button type="button" class="btn btn-success">
                <g:link controller="PatientController" action="create">Add Patient</g:link>
                </button>
            </div>
            <div class="doctors">
                <h3> Doctor Management </h3>
                <p></p>
                <button type="button" class="btn btn-success">
                <g:link controller="DoctorController" action="create">Add Doctor</g:link>
                </button>
            </div>
            <div class="nurses">
                <h3> Nurse Management </h3>
                <p></p>
                <button type="button" class="btn btn-success">
                <g:link controller="NurseController" action="create">Add Nurse</g:link>
                </button>
            </div>
            <div class="receptionists">
                <h3> Receptionist Management </h3>
                <p></p>
                <button type="button" class="btn btn-success">
                <g:link controller="ReceptionistController" action="create">Add Receptionist</g:link>
                </button>
            </div>
        </div>
    </div>
</body>
</html>