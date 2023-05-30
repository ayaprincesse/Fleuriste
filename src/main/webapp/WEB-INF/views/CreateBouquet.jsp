<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css"/>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bouquet Creation</title>
        <style>
        .item-card {
                    margin-bottom: 20px;
                }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <div class="container">
                        <a class="navbar-brand" href="#"> Créer Bouquet </a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNav">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="createFleur"> Fleur Creation</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="fleursList">Liste des Fleurs</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="bouquetList">Liste des Bouquets</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
        <header>
         <div class="d-flex justify-content-center vh-10">
                    <h1 class="display-4">Creation de bouquet</h1>
         </div>
        </header>

        <main>
            <form action="saveBouquet" method="post" enctype="multipart/form-data">
                <div class="row">
                    <div class="col-md-6">
                        <div class="mb-3">Ajouter des fleurs au bouquet :</div>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Fleur</th>
                                    <th>Nom</th>
                                    <th>Couleur</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${fleursJsp}" var="fleur">
                                    <tr>
                                        <td><img alt="" src="data:image/jpeg;base64,${fleur.imageFleur}" style="width: 100px;height: 100px;"></td>
                                        <td>${fleur.nomFleur}</td>
                                        <td>${fleur.couleurFleur}</td>
                                        <td><button id="addItemBtn" class="btn btn-primary">Add flower</button></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-md-6">
                        <div class="mb-3">
                            <label for="typebouquet">Type :</label>
                            <select id="typebouquet" name="typebouquet" class="form-select">
                                <option value="ROND">Rond</option>
                                <option value="PARALLELE">Parallèle</option>
                                <option value="LONGS">Longs</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="customFile">Add an image:</label>
                            <div class="input-group">
                                <input type="file" name="file" class="form-control" id="customFile">
                                <label class="input-group-text" for="customFile">Choose image</label>
                            </div>
                        </div>
                        <input type="submit" class="btn btn-primary" value="Save">
                    </div>
                </div>
            </form>
        </main>


    </body>
</html>