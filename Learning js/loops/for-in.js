// for-in can be used with objects and arrays too

let userProfile = {
    name: "Rohan",
    age: 29
};

for( let z in userProfile){
    console.log(z, userProfile[z]);
}

// also applicable for arrays
let arr4 = [ "US", "Canada", "Africa"];

for( let p in arr4){
    console.log(p);
}




// for-in is for objects, not arrays (may cause issues with unexpected keys)
// forEach can't use break or continue
// while and do-while work best when number of iterations is unknown

