<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css"/>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style>
	.btn-pink {
      background-color: #e91e63;
      border-color: #e91e63;
      color: white;
    }
    .btn-pink:hover {
      background-color: #c2185b;
      border-color: #c2185b;
    }
	</style>
</head>
<body>

<div class="container-fluid d-flex align-items-center justify-content-center" style="height: 100vh">
	<div class="row">
		<div class="">
			<div class="login-panel panel panel-default ">
				<div class="panel-heading d-flex justify-content-center">
					<h3 class="panel-title">Please Sign In</h3>
				</div>
				<div class="panel-body">
					<form action="loginAdmin" method="post" role="form" >
						<fieldset>
							<div class="form-group m-3 d-flex justify-content-center">
								<input class="form-control" placeholder="Username" name="username" type="text" autofocus="">
							</div>
							<div class="form-group m-3 d-flex justify-content-center">
								<input class="form-control" placeholder="Password" name="password" type="password" value="">
							</div>
							<div class="checkbox m-3 d-flex justify-content-center">
								<label>
									<input name="remember" type="checkbox" value="Remember Me">Remember Me
								</label>
							</div>
							<div class="m-3 d-flex justify-content-center">
							<button type="submit" class="btn btn-lg btn-success btn-block btn-pink">Login</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>