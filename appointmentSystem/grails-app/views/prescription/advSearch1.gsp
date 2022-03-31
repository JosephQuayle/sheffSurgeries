<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>

<div>
    <h1>Patient Search</h1>
        <formset>
                <legend> Advanced Search for Prescriptions</legend>
                <table>
                    <g:form action="advResults1">
                        <tr>
                            <td>Medicine Name</td>
                            <td><g:textField name="medicine"/></td>
                        </tr>
                        <tr>
                            <td>Total Cost</td>
                            <td><g:textField name="totalCost"/></td>
                        </tr>
                        <tr>
                            <td>Prescription Number</td>
                            <td><g:textField  name="prescripNumber" /></td>
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
