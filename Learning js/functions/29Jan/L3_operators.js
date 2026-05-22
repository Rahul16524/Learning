"use strict";   
// Default, Rest, Spread

// a = 1 -> default parameter

// Default: 
function multiply(a = 1, b =2 ){
    return a* b;
}

// ---------
// rest operator: remaining array elements will be stored in variable after ... (rest operator)
const arr = [10, 20, 30];
const [first, second, ...rest] = [2,4,7,5,8];

console.log(first);
console.log(second);
console.log(rest);

function multiply( a = 2, b = 3, ...c){     // ... collect and also convert into spread also
    console.log(a);
    console.log(c);

}

multiply(1,2,3,4,5);

// ---------
// spread operator






let arr1 = [2,4,5];
let arr2 = [6,7];

let arr3 = [...arr1, ...arr2, 8, 9];
console.log(arr3);

let x = 2;
console.log(x);