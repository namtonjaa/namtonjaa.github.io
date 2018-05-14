
		let courses;
		
		$(function() {
			generateCourseHtmlRows();
		});
		
		function getAllCourses() {
			$.ajax({
				 async: false,
				 type: 'GET',
				 url: "http://localhost:8080/admin/course/all",
				 success: function(data) {
					courses = data;
				 }
			});
		}
		
		function generateCourseHtmlRows() {
			getAllCourses();
			if (typeof(courses) != 'undefined' && courses.length > 0) {
				for (let i = 0; i < courses.length; i ++) {
					let course = courses[i];
					$("#Courselist").last().append("<tr><td>" + course.courseId + "</td><td>" + course.courseName + "</td><td>" + course.professorName + "</td><td>" + course.semester + "</td><td>" + course.credit + "</td><td>" + course.seat + "</td></tr>");
				}
			}
		}
