$(function() {
            $("#login_btn").click(function() {
                login();
            });
        })

        function login() {
            $.post("http://localhost:8080/user/login",
            {
                userName: $("#username").val(),
                password: $("#password").val()
            },
            function(data, status){
                if (typeof(data.userName) != 'undefined') {
                    localStorage.setItem("isLoggedin", true);
                    localStorage.setItem("firstName", data.firstName);
					localStorage.setItem("lastName", data.lastName);
                    window.location = "/xampp/htdocs/webproject-frontend/Teacher/TeacherMain.html";
					}
		
                else {
                    alert("Invalid username or password. Please try again.");
                }
            });
        }