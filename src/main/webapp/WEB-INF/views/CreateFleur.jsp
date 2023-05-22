<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Fleur Creation</title>
    </head>
    <body>
        <header>
            <h1>Fleur Creation</h1>
           </header>
        <main>
            <form action="saveFleur" method="post" enctype="multipart/form-data">
                <div>
                    <label for="nom">Nom : </label>
                    <input type="text" id="nom" name="nom">
                </div>
                 <div>
                     <label for="prix">Prix : </label>
                     <input type="text" id="prix" name="prix">
                 </div>
                <div>
                    <label for="couleur">Couleur : </label>
                    <input type="text" id="couleur" name="couleur">
                </div>
                <label>add an image</label>
                <div class="custom-file mb-2">
                    <input type="file" name="file" class="custom-file-input" id="customFile">
                    <label class="custom-file-label" for="customFile">Choose
                        image</label>
                </div>
                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
        </main>
        <footer>
            <a href="fleurList">Fleurs List</a>
        </footer>
    </body>
</html>