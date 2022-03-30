<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SheffSurgeries Login</title>
    <asset:stylesheet src="login.css"/>
</head>
<body>

<g:if test="${flash.message}">
    <div class="message">${flash.message}</div>
</g:if>

<g:form action="validate">
 <input type="hidden" name="cName" value="${cName}">
 <input type="hidden" name="aName" value="${aName}">
 <table>
        <tr class="prop">
          <td class="name">
            <label for="username">User Name:</label>
          </td>
          <td class="value">
            <input type="text" id="username" name="username" placeholder="e.g Ricky01" value="">
          </td></tr>
        <tr class="prop">
          <td class="name">
            <label for="password">Password:</label>
          </td>
          <td class="value">
            <input type="password" id="password" name="password" placeholder="type your password" value="">
          </td></tr>
        <tr><td></td>
          <td>
            <input class="btn link" type="submit" value="Login"/>
          </td></tr>
    </table>
</g:form>

</body>