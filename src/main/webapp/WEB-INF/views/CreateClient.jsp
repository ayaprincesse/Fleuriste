<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Client Creation</title>
    </head>
    <body>
        <header>
            <h1>Client Creation</h1>
           </header>
        <main>
            <form action="saveClient" method="post">
                <div>
                    <label for="nom">Last Name : </label>
                    <input type="text" id="nom" name="nom">
                </div>
                <div>
                    <label for="prenom">First Name : </label>
                    <input type="text" id="prenom" name="prenom">
                </div>
                <div>
                    <label for="telephone">Telephone Number : </label>
                    <input type="text" id="telephone" name="telephone">
                </div>
                <div>
                    <label for="username">Username : </label>
                    <input type="text" id="username" name="username">
                </div>
                <div>
                    <label for="password">Password : </label>
                    <input type="password" id="password" name="password">
                </div>

                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
        </main>
        <footer>
            <a href="clientsList">Clients List</a>
        </footer>
    </body>
</html>