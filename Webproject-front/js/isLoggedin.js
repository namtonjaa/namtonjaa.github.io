
        $(function() {
            if (!checkIfLoggedin()) {
                window.location = "/xampp/htdocs/webproject-frontend/Student/StudentLogin.html";
            }
            else {
                console.log(localStorage.getItem("firstName"));
				console.log(localStorage.getItem("lastName"));
            }
        });

        function checkIfLoggedin() {
            if (localStorage.getItem("isLoggedin")) {
                return true;
            }
            return false;
        }
