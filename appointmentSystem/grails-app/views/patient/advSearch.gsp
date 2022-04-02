<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="advSearch.css"/>
</head>
<body>

<div class="search-form">
    <h1>Patient Search</h1>
        <formset>
                <legend> Advanced Search for Patients</legend>
                <table>
                    <g:form action="advResults">
                        <tr>
                            <td>Name</td>
                            <td><g:textField name="patientName" placeholder="e.g Derek Marple"/></td>
                        </tr>
                        <tr>
                            <td>Address</td>
                            <td><g:textField name="patientAddress" placeholder="e.g 50 Division Street"/></td>
                        </tr>
                        <tr>
                            <td>Phone</td>
                            <td><g:textField name="patientPhone" placeholder="e.g 07564736264"/></td>
                        </tr>
                        <tr>
                            <td>Query Type:</td>
                            <td><g:radioGroup name="queryType" labels="['And', 'Or', 'Not']" values="['and', 'or', 'not']" value="and"> ${it.radio} ${it.label}</g:radioGroup>
                            </td>
                        </tr>
                        <tr>
                            <td> <g:submitButton name="search" value="Search"/></td>
                        </tr>
                    </g:form>
                </table>
            </formset>
</div>

</body>
</html>
