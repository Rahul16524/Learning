// Hoisting: Declartions vs Expressions

ac();   // for functions: calling it before being declared -> possible
        // at run time the function declartion automatically moves above
function ac() {
    console.log("Turn on the ac");
}



// will give error: function expressions give error when called before being declared
// helloprint();
let helloprint = function () {
    console.log("Hi");
}






