/**
 * Created by ganeshramiyer on 11/1/16.
 */
console.log("Hello");

var userDetails = {
    firstName : null,
    lastName : null,
    email: null,
    university : null,
    department: null,
    password : null
}

var universityDetails = null;

$("#signup").click(function() {
    userDetails.firstName = $("#firstname").val();
    userDetails.lastName = $("#lastname").val();
    userDetails.email = $("#email").val();
    userDetails.university = $("#university-dropdown").val();
    userDetails.department = $("#department-dropdown").val()
    userDetails.password = $("#password").val();
    console.log(userDetails);
    sendData(userDetails);
});

$("#university-dropdown").click(function(){
    getUniversityList();
}) ;

$("#department-dropdown").click(function(){
    getDeptList($("#university-dropdown").val());
});

sendData = function (userDetails) {
    $.ajax({
        type: "POST",
        contentType : 'application/json; charset=utf-8',
        dataType : 'json',
        url: "/registeruser",
        data: JSON.stringify(userDetails),
        success :function(result) {
            console.log("User saved");
        }
    });
}


getUniversityList = function () {
    $.ajax({
        type: "GET",
        dataType : 'json',
        url: "/getuniversities",
        success :function(result) {
            universityDetails = result;
            loadUnivDropdown(universityDetails);
        },
        error : function (status) {
            console.log("No database Connection");
        }
    });
}

loadUnivDropdown = function (result) {
    $("#university-dropdown").empty();
    var univList = [];

    for(var i = 0; i < result.length; i++) {
        if (!univList.includes(result[i].universityName)) {
            univList.push(result[i].universityName);
            $("#university-dropdown").append('<option value="'+result[i].universityName+'">'+result[i].universityName+'</option>');
        }
    }
}

getDeptList = function (univName) {
    $.ajax({
        type: "GET",
        contentType : 'application/json; charset=utf-8',
        dataType : 'json',
        url: "/getdept",
        data: {univName : univName},
        success :function(result) {
            loadDeptDropdown(result);
        },
        error : function (status) {
            console.log("No database Connection");
        }
    });
}

loadDeptDropdown = function (result) {
    $("#department-dropdown").empty();
    for(var i = 0; i < result.length; i++) {
        $("#department-dropdown").append('<option value="'+result[i].departmentInfo+'">'+result[i].departmentInfo+'</option>');
    }
}