<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Fonts -->
<link rel="dns-prefetch" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,600"
	rel="stylesheet" type="text/css">



<link rel="icon" href="Favicon.png">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/deposit.css">

<title>Online Banking System</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light navbar-laravel">
		<div class="container">
			<a class="navbar-brand" href="#"><b>Online Banking System</b></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="register.jsp">Add
							Account</a>
					<li class="nav-item"><a class="nav-link" href="register.jsp">About
							Us</a>
					<li class="nav-item"><a class="nav-link" href="register.jsp">Logout</a>
					</li>
				</ul>

			</div>
		</div>
	</nav>

	<main class="my-form">
	<div class="cotainer">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">

					<div class="card-header">Deposit Form</div>
					<div class="card-body">
						<form name="my-form" onsubmit="return validform()"
							action="login.jsp" method="get"></form>

						<div class="form-group row">
							<label for="full_name"
								class="col-md-4 col-form-label text-md-right">Account
								Number</label>
							<div class="col-md-6">
								<input type="text" id="full_name" class="form-control"
									name="full-name">
							</div>
						</div>

						<div class="form-group row">
							<label for="user_name"
								class="col-md-4 col-form-label text-md-right">User Name</label>
							<div class="col-md-6">
								<input type="text" id="user_name" class="form-control"
									name="username">
							</div>
						</div>

						<div class="form-group row">
							<label for="password"
								class="col-md-4 col-form-label text-md-right">Password</label>
							<div class="col-md-6">
								<input type="password" id="password" class="form-control"
									name="password">
							</div>
						</div>

						<div class="form-group row">
							<label for="confirm_password"
								class="col-md-4 col-form-label text-md-right">Amount</label>
							<div class="col-md-6">
								<input type="password" id="confirm_password"
									class="form-control" name="confirm_password">
							</div>
						</div>


					</div>

				</div>
			</div>

		</div>
	</div>


	</main>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>