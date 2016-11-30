/**
 * Created by ganeshramiyer on 11/16/16.
 */
var credentials = {
    username : null,
    password : null
}

$("#signin-button").click(function(){
    credentials.username = $("#email").val();
    credentials.password = $("#inputPassword").val();
    checkCredentials(credentials);
});

checkCredentials = function(credentials) {
    $.ajax({
        type: "GET",
        contentType : 'application/json; charset=utf-8',
        dataType : 'json',
        url: "/validateuser",
        data: {username : credentials.username, password : credentials.password},
        success : function(result) {
            console.log(result)
        },
        failure : function (result) {
            console.log("Error");
        }
    });
}