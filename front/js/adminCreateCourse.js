
		function createCourse() {
			let course = {
					"courseId":parseInt($("#courseId").val()),
					"courseName":$("#courseName").val(),
					"professorName":$("#teacherName").val(),
					"semester":parseInt($("#semester-select").val()),
					"credit":parseInt($("#credit").val()),
					"seat": parseInt($("#maxSeat").val())
				};
				
			$.ajax({
				url:"http://localhost:8080/admin/course/create",
				method:"POST",
				data:JSON.stringify(course),
				headers: { 
					'Accept': 'application/json',
					'Content-Type': 'application/json' 
				},
				statusCode: {
					201: function (response) {
						alert('Created');
					}
			   }
			});
		}
