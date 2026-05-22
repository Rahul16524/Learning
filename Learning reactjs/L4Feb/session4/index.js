function f1() {
    var username = "RanVijay";
    var age = 24;

    var msg = "Hello" + username + " your age is "+ (age + 1);

    var msg2 = `Hello ${username} your age is ${(age + 1)}`;
    console.log(msg);
    console.log(msg2);
}

f1();

// null,  undefined
function f2() {
    var x;

    console.log( "x = " + x);

    // if at run time, like prompt the,
    //  value is not provided then it will store null
}
f2();

// array
function f3() {
    var values = ["A", 10, true, ["Hyd", "Delhi"], function() { console.log("Hello !")}];

    console.log(values[1]);
    console.log(values[4]());
}
f3();


function f4(){
    var values = ["A", 10, true, ["Hyd", "Delhi"], function() { console.log("Hello !")}];

    values[ names, id, stock, cities , hello] = values;
    console.log(cities[1]);

    hello();
}
f4();