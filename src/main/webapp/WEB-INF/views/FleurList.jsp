<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
     <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css"/>

        <meta charset="utf-8">
        <title>Fleurs List</title>
        <style>
        .table-sm {
          max-width: 50%;
          margin: 0 auto; /* Center the table horizontally */
        }
        </style>
    </head>
    <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#">Liste des Fleurs</a>
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
                    <h1 class="display-4">Liste de fleurs</h1>
         </div>
        </header>
        <main>
              <table class="table table-striped table-bordered table-sm">
                <thead>
                  <tr>
                    <th>Fleur</th>
                    <th>Nom</th>
                    <th>Prix</th>
                    <th>Couleur</th>
                    <th></th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach items="${fleursJsp}" var="fleur">
                    <tr>
                      <td>
                        <img alt="" src="data:image/jpeg;base64,${fleur.imageFleur}" style="width: 200px;height: 150px;">
                      </td>
                      <td>${fleur.nomFleur}</td>
                      <td>${fleur.prixFleur}</td>
                      <td>${fleur.couleurFleur}</td>
                      <td>
                        <a onclick="return confirm('Are you sure you want to delete?')"
                          href="deleteFleur?id=${fleur.idFleur}" class="btn btn-danger" style="background-color: hotpink;">
                          Delete
                         </a>
                      </td>
                    </tr>
                  </c:forEach>
                </tbody>
              </table>
        </main>


    </body>
</html>



