// Iteration methods

let arr = ["Delhi", "Agra", "Rajasthan"];

let arr2 = arr.map(n => {
    return n + " ok";
})

console.log(arr2);


// filter out elements based on a condition
let nums = [1, 2, 3, 4];

let nums3 = nums.filter(n => n * 2 > 3);

console.log(nums3);


// reduce: reduces array to a single value

let nums2 = [2, 4, 5, 8];

let nums4 = nums2.reduce( (a, c) => a + c, 2);
console.log(nums4);


// forEach() : performs an action for each element
let nums5 = [4, 2, 9, 5];
nums5.forEach( x => {
    console.log(nums5.find);
})


// find(), some(), every()
console.log(nums5.find( n => n > 4));
console.log(nums5.some(n => n > 5));
console.log(nums5.every( n => n > 0));



