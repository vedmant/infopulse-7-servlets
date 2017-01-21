<!DOCTYPE html>
<html>
<head>
    <title>Title</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
</head>
<body>

<div class="container">

    <div class="row">
        <div class="col-sm-4 col-sm-push-4">

            <br><br><br>
            <div class="panel panel-primary">
                <form action="handle" method="get">
                    <div class="panel-heading"><h3>Test form</h3></div>
                    <div class="panel-body">
                        <div class="form-group">
                            <label>Username</label>
                            <input type="text" class="form-control" name="name">
                        </div>
                    </div>
                    <div class="panel-footer">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>

            <a href="/show">Show info</a>

        </div>
    </div>

</div>

</body>
</html>
