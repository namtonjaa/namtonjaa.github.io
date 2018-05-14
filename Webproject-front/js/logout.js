
        $(function() {
            $("#logout_btn").click(function() {
                logout();
            });
        })

        function logout() {
            localStorage.clear();
            window.location = "/xampp/htdocs/webproject-frontend/Index.html";
            }
