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
            Class:
        </div>
        <div class="col-sm-4 centerAlignment">
            <a target="_blank" href="${generatedCharacter.characterClass.pfsrdLink}">${generatedCharacter.characterClass.className}</a>
        </div>
        <div class="col-sm-2"></div>
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
            Alignment:
        </div>
        <div class="col-sm-4 centerAlignment">
            ${generatedCharacter.alignment.lawfulChaotic} ${generatedCharacter.alignment.goodEvil}
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
            Description:
        </div>
        <div class="col-sm-4 centerAlignment">
            ${generatedCharacter.description.descriptionString}
        </div>
        <div class="col-sm-2"></div>
    </div>
    <br/>
    <div class="row centerAlignment">
        <a class="btn btn-primary" href="/TeamProject">Generate New Character</a>
    </div>
    <br/>
    <div class="row">
        <h3 class="centerAlignment">
            How to use:
        </h3>
    </div>
    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
            <p>First, make a REST call out to the following address:</p>
            <p class="centerAlignment"><code>http://52.14.40.39:8080/TeamProject/characterGenerator</code></p>
            <p>The following <b>objects</b> and <i>instance variables</i> should be created using the JSON gotten above:</p>
            <ul>
                <li>
                    <b>GeneratedCharacter</b><br/>
                    GeneratedCharacter has the following objects as instance variables:
                    <ul>
                        <li>
                            <b><i>characterClass</i></b>
                            <ul>
                                <li>
                                    <i>pfsrdLink</i>
                                </li>
                                <li>
                                    <i>className</i>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <b><i>race</i></b>
                            <ul>
                                <li>
                                    <i>pfsrdLink</i>
                                </li>
                                <li>
                                    <i>raceName</i>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <b><i>alignment</i></b>
                            <ul>
                                <li>
                                    <i>lawfulChaotic</i>
                                </li>
                                <li>
                                    <i>goodEvil</i>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <b><i>origin</i></b>
                            <ul>
                                <li>
                                    <i>originString</i>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <b><i>quirk</i></b>
                            <ul>
                                <li>
                                    <i>quirkString</i>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <b><i>description</i></b>
                            <ul>
                                <li>
                                    <i>descriptionString</i>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="col-sm-3">

        </div>
    </div>
    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
            <p>
                Name and String instance variables contain useful information about the character.
            </p>
            <p>
                For example, to get a generated character's race, use the following API methods:
            </p>
            <p class="centerAlignment">
                <code>
                    generatedCharacter.race.raceName
                </code>
            </p>
            <p>
               Links to the generated character's race and class d20PFSRD pages are also included.
            </p>
            <p>
                A character's alignment is split into two instance variables:
                <ul>
                    <li>
                        lawfulChaotic, which includes the following possibilities:
                        <ul>
                            <li>
                                Lawful
                            </li>
                            <li>
                                Neutral
                            </li>
                            <li>
                                Chaotic
                            </li>
                        </ul>
                    </li>
                    <li>
                        goodEvil, which includes the following possibilities:
                        <ul>
                            <li>
                                Good
                            </li>
                            <li>
                                Neutral
                            </li>
                            <li>
                                Evil
                            </li>
                        </ul>
                    </li>
                </ul>
            </p>
        </div>
        <div class="col-sm-3"></div>
    </div>
</div>

</body>
</html>
