<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="sheffsurgeryicon.svg"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

 <nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
    <div class="container-fluid">
        <a class="navbar-brand" href="/#"><asset:image src="grails.svg" alt="Grails Logo"/></a>
    </div>
</nav>

<g:layoutBody/>

<div class="footer" role="contentinfo">
    <div class="container-fluid">
        <div class="row">
            <div class="col">
            <asset:image src="doc.png"/>
                <h3 class="best-doctors"> Best Doctors </h3>
                <p>Here ar sheffSurgeries, we have the best doctors in the UK. All of them are ready to help you in any way possible. Dont hesitate to make an appointment!</p>
            </div>
            <div class="col">
            <asset:image src="shorttime.jpg"/>
                <h3 class="short-times"> Short Waiting Times </h3>
                <p>Not only do we have the best Doctors and Nurses, we also have the best waiting times!</p>
            </div>
            <div class="col">
                <asset:image src="trustworthy.png"/>
                <h3 class="trustworthy">Trustworthy</h3>
                <p>You will never have to worry about your prescription being delayed, changed by accident, cancelled for no reason, etc. We pride ourselves on never disappointing our patients.</p>
            </div>
        </div>
    </div>
</div>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
