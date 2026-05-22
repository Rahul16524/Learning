// Higher Order Functions (HOF): function returning function

function createMultiplier(x) {
    return function(y) {
        return x*y;
    }
}

let double = createMultiplier(10);
let third = double(3);
console.log(third);


// my example
function fun1(x) {
	return function(y) {
		return x*y;
	}
}

let var1 = fun1(3);
let var2 = var1(4);

console.log(var2);

