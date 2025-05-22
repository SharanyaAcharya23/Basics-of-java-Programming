<%@ page session="true" %>
<html>
<head>
    <title>Session Demo</title>
</head>
<body>
    <h2>Enter Your Name</h2>
    <form action="greet.jsp" method="post">
        <input type="text" name="username" required />
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
