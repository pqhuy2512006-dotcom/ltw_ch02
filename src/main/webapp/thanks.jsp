<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${survey.email}</span><br>

    <label>First Name:</label>
    <span>${survey.firstName}</span><br>

    <label>Last Name:</label>
    <span>${survey.lastName}</span><br>

    <label>Date of Birth:</label>
    <span>${survey.dob}</span><br>

    <label>Heard about us:</label>
    <span>${survey.hearFrom}</span><br>

    <label>Announcements:</label>
    <span>${survey.wantsAnnouncements}</span><br>

    <label>Special Offers:</label>
    <span>${survey.wantsSpecialOffers}</span><br>

    <label>Contact Method:</label>
    <span>${survey.contactMethod}</span><br>

    <p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>

    <form action="emailList" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return" id="submit">
    </form>
</body>
</html>