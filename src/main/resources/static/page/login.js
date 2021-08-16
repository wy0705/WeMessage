$("#loginBtn").click(function () {
    // $.ajax({
    //     URL: "http://localhost:5500/html/login.html",
    //     method: 'post',
    //     data: {'username': $('#username').val(),
    //     'password':$('#password').val()},
    //     xhrFields: {
    //         withCredentials: true //允许跨域带Cookie
    //     },
    //     success: function (result) {
    //         window.location.href="../page/information.html";
    //     },
    //     error: function (result) {
    //         alert(result.responseText)
    //     },
    // })
    window.location.href="../page/information.html";
});