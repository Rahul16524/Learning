function VerifyPassword( str, success, error) {
    if( str == "admin"){
        success();
    } else {
        error();
    }
}

VerifyPassword("admin", function () {
    console.log("Login success");
}, function () {
    console.log("Invalid password");
})