<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css"/>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Fleur Creation</title>
    </head>
    <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Fleur Creation</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="fleurList">Liste des Fleurs</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CreateBouquet">Créer Bouquet</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Liste des Bouquets</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
        <header>
        <div class="d-flex justify-content-center vh-10">
            <h1 class="display-4">Fleur Creation</h1>
        </div>
         </header>
        <main class="container mt-4">
            <form action="saveFleur" method="post" enctype="multipart/form-data">
                <div class="mb-3">
                    <label for="nom" class="form-label">Nom:</label>
                    <input type="text" class="form-control" id="nom" name="nom">
                </div>
                <div class="mb-3">
                    <label for="prix" class="form-label">Prix:</label>
                    <input type="text" class="form-control" id="prix" name="prix">
                </div>
                <div class="mb-3">
                    <label for="couleur" class="form-label">Couleur:</label>
                    <input type="text" class="form-control" id="couleur" name="couleur">
                </div>
                <div class="mb-3">
                    <label for="customFile" class="form-label">Add an image:</label>
                    <div class="input-group">
                        <input type="file" name="file" class="form-control" id="customFile">
                        <label class="input-group-text" for="customFile">Choose image</label>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Save</button>
            </form>
        </main>

    </body>
</html>