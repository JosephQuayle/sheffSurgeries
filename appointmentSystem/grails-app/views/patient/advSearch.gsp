<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>

<div>
    <h1>Patient Search</h1>
        <formset>
                <legend> Advanced Search for Patients</legend>
                <table>
                    <g:form action="advResults">
                        <tr>
                            <td>Name</td>
                            <td><g:textField name="patientName"/></td>
                        </tr>
                        <tr>
                            <td>Address</td>
                            <td><g:textField name="patientAddress"/></td>
                        </tr>
                        <tr>
                            <td>Phone</td>
                            <td><g:textField name="patientPhone"/></td>
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
