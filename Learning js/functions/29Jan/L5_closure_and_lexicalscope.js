// closures and Lexical Scope
//  Closures: when a function, remembers its parent scope, even when the parent has finished(executed once).

function outerfunction() {
    let count = 0;

    return function() {
        count++;  //

        return count;
    }
}

let innerValue =  outerfunction();
let countValue =  innerValue();
console.log(countValue);

let countValue2 = innerValue();
console.log(countValue2);

// Q) How is that possible?