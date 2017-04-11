<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Character Generator</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<div class="jumbotron text-center">
    <h1>Character Generator</h1>
    <p>Click the button to generate a character!</p>
</div>

<div class="container">
    <div class="row centerAlignment">
        ${error}
    </div>
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-4 centerAlignment">
            Race:
        </div>
        <div class="col-sm-4 centerAlignment">
            <a target="_blank" href="${generatedCharacter.race.pfsrdLink}">${generatedCharacter.race.raceName}</a>
        </div>
        <div class="col-sm-2"></div>
    </div>
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-4 centerAlignment">
            Description:
        </div>
        <div class="col-sm-4 centerAlignment">
            ${generatedCharacter.description.descriptionString}
        </div>
        <div class="col-sm-2"></div>
    </div>
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-4 centerAlignment">
            Origin:
        </div>
        <div class="col-sm-4 centerAlignment">
            ${generatedCharacter.origin.originString}
        </div>
        <div class="col-sm-2"></div>
    </div>
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-4 centerAlignment">
            Quirk:
        </div>
        <div class="col-sm-4 centerAlignment">
            ${generatedCharacter.quirk.quirkString}
        </div>
        <div class="col-sm-2"></div>
    </div>
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-4 centerAlignment">
            Alignment:
        </div>
        <div class="col-sm-4 centerAlignment">
            ${generatedCharacter.alignment.lawfulChaotic} ${generatedCharacter.alignment.goodEvil}
        </div>
        <div class="col-sm-2"></div>
    </div>
    <div class="row centerAlignment">
        <a class="btn btn-primary" href="/">Generate New Character</a>
    </div>
</div>

</body>
</html>
