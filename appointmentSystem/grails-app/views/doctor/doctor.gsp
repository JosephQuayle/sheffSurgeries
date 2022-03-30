<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SheffSurgeries | Home Page</title>
    <asset:stylesheet src="doctor.css"/>
</head>
<body>
    <div id="logins" class="row">
        <g:loginToggleDoc/>
    </div>
    <div id="content" role="main">
        <div class="row">
            <div class="prescriptions">
                <h3> Prescription Management </h3>
                <p></p>
                <button type="button" class="btn btn-success">
                <g:link controller="prescription" class="link" action="create">Add Prescription</g:link>
                </button>
            </div>
            <div class="patients">
                <h3> Patient Management </h3>
                <p></p>
                <button type="button" class="btn btn-success">
                <g:link controller="patient" class="link" action="create">Add Patient</g:link>
                </button>
            </div>
            <div class="appointments">
                <h3> Appointment Management </h3>
                <p></p>
                <button type="button" class="btn btn-success">
                <g:link controller="appointment" class="link" action="create">Add Appointment</g:link>
                </button>
            </div>
        </div>
    </div>
</body>
</html>