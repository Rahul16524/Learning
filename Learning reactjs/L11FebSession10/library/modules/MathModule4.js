// prev session 

export  function Addition2(a, b) {
    return a + b;
}


//  or
export const Addition = ( a, b) => {
    return (a + b);
}






// ----- default
// export default const Subraction = ( a, b) => {      // with const we cannot use, in same line, write in 2 lines
//     return (a + b);
// }// only one default export we can use in whole module

export default function Subtraction ( a, b) {      // with const we cannot use, in same line, write in 2 lines
    return (a - b);
}// only one default export we can use in whole module