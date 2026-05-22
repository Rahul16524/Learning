var values = [ 1, "TV", true, ["Delhi", "Hyd"]];
var[id , name, stock, cities] = values;

console.log(name);
console.log(cities[1]);



// # map
var categories = ["Electronics", "Footwear", "Fashion"];
categories.map( x => console.log(x));

// categories.map(function(category) {
//     document.write(`<a href= "#"> ${category} </a>`);        // vs code it will not run dom code
// })


// add
categories.splice(1,0, "Kids");
console.log(categories);


// remove
categories.splice(1,1);
console.log(categories);



//  sorting and reverse
let arr = [ 4, 10, 7, 12];
arr.sort();

console.log(arr);

arr.sort((a,b) => a - b);
console.log(arr);


arr.sort((a,b) => b-a);
console.log(arr);


console.log(arr.reverse());


function f1() {
    var tv = {
        
    "Name" : "Samsung tv",
    "Price" : 45000.44,
    "Cities" : ["Delhi", "Hyd"],
    "Rating" : {
        "Rate" : 4.2,
        "count" : 5600
    },
    "Qty" : 2,
    // "Total" : function() {
    //     return this.Qty * this.Price;
    // }

    "Total" : function () {
        return this.Qty * this.Price;
    } 
    }
console.log( `Name = ${tv.Name} \n
                Price = ${tv.Price} \n
                Cities = ${tv.Cities}\n
                Rating = ${tv.Rating}\n
                Qty = ${tv.Qty} \n
                Total = ${tv.Total}`);
}

f1();





