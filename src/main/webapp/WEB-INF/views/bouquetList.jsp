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
                <a class="navbar-brand" href="#">Liste des Bouquets</a>
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
                            <a class="nav-link" href="fleurList">Liste des Fleurs</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <header>
         <div class="d-flex justify-content-center vh-10">
                    <h1 class="display-4">Liste de Bouquets</h1>
         </div>
        </header>
        <div style="overflow-x: scroll;">
                      <table >
         <tr>
                        <c:forEach items="${bouquetsJsp}" var="bouq">
                            <td>
                            <div style="display:grid">
                            <img alt="" src="data:image/jpeg;base64,${bouq.image}" style="width: 370px;height: 468px;">

                            <a OnClick="return confirm('Are you sure you want to delete?') "
                            href="deleteBouquet?id=${bouq.idBouquet}" >Supprimer</a>
                           </div>
                            </td>
                        </c:forEach>
         </tr>
                      </table></div>

    </body>
</html>



