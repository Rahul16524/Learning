// functions,
// functions expressions,
// fat arrow functions
// ---------------------------------------------------------------------------------------
console.log("-----------")
// functions expressions (=): storing in the variables

const greet = function come () {
    console.log("Hello!");
};

greet();        // worked
// come();  // it will give error, now come becomes private., and not accessible to outer scope.

// // if we assign multiple '
    let welcome = greet();
    console.log(welcome); // priting the return value by function

    let againWelcome = greet;   // storing the same function, then calling the function
    againWelcome();
    console.log(againWelcome());    // again printing the return value by the fuuction
    // welcome();           // welcome is now not a fuction so we can't call like this now.


console.log("---------------")
// --------------------------------
// fat arrow functions



let greet5 = () => {
    console.log("Hi!");
}

greet5();


// ============================================================================================