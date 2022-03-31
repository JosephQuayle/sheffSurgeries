<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SheffSurgeries | Home Page</title>
    <asset:stylesheet src="receptionist.css"/>
</head>
<body>
    <div id="logins" class="row">
        <g:loginToggleRec/>
    </div>
    <div id="content" role="main">
        <div class="row">
            <div class="patients">
                <h3> Patient Management </h3>
                <p></p>
                <button type="button" class="btn">
                <g:link controller="patient" class="link" action="create">Add Patient</g:link>
                </button>
                <button type="button" class="btn">
                <g:link controller="patient" class="link" action="advSearch">Search Patients</g:link>
                </button>
                 
            </div>
            <div class="doctors">
                <h3> Doctor Management </h3>
                <p></p>
                <button type="button" class="btn">
                <g:link controller="doctor" class="link" action="create">Add Doctor</g:link>
                </button>
            </div>
            <div class="nurses">
                <h3> Nurse Management </h3>
                <p></p>
                <button type="button" class="btn">
                <g:link controller="nurse" class="link" action="create">Add Nurse</g:link>
                </button>
            </div>
            <div class="receptionists">
                <h3> Receptionist Management </h3>
                <p></p>
                <button type="button" class="btn">
                <g:link controller="receptionist" class="link" action="create">Add Receptionist</g:link>
                </button>
            </div>
        </div>
       
    </div>
</body>
</html>