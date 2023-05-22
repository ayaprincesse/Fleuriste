<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Fleurs List</title>
    </head>
    <body>
        <header>
            <h1>Fleurs List</h1>
        </header>
        <main>
              <table >

                <c:forEach items="${fleursJsp}" var="fleur">
                <tr>
                <th>nom</th>
                <th>couleur</th>
                <th>prix</th>
                <th></th>
                </tr>
                <tr>
                    <td> <img alt="" src="data:image/jpeg;base64,${fleur.image}" style="width: 100px;height: 100px;">  </td>
                    <td> ${fleur.nom} </td>
                    <td> ${fleur.couleur} </td>
                    <td> ${fleur.prix} </td>
                    <td> <a OnClick="return confirm('Are you sure you want to delete?') "
                    href="deleteFleur?id=${fleur.id}" >Delete</a>
                    </td>
                </tr>
                </c:forEach>

              </table>
        </main>
        <footer>
            <a href="createFleur">Fleur Creation</a>
        </footer>
    </body>
</html>



