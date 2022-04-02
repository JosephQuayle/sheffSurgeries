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
                <legend> Advanced Search for Prescriptions</legend>
                <table>
                    <g:form action="advResults1">
                        <tr>
                            <td>Medicine Name</td>
                            <td><g:textField name="medicine" placeholder="e.g Ibuprofen"/></td>
                        </tr>
                        <tr>
                            <td>Total Cost</td>
                            <td><g:textField name="totalCost" placeholder="e.g 3"/></td>
                        </tr>
                        <tr>
                            <td>Prescription Number</td>
                            <td><g:textField  name="prescripNumber" placeholder="e.g P1" /></td>
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
