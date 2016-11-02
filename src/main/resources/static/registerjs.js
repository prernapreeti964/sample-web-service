/**
 * Created by ganeshramiyer on 11/1/16.
 */
console.log("Hello");

var userDetails = {
    firstName : null,
    lastName : null,
    email: null,
    university : null,
    password : null
}

$("#signup").click(function() {
    userDetails.firstName = $("#firstname").val();
    userDetails.lastName = $("#lastname").val();
    userDetails.email = $("#email").val();
    userDetails.university = "test";
    userDetails.password = $("#password").val();
    console.log(userDetails);
    sendData(userDetails);
    console.log("Data sent");
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