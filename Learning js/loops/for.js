for( let i = 0; i < 5 ; i++) {
    console.log(i);
}

let j = 0;
while( j < 6){
    console.log(j);
    j++
}

// let y = 0;
// do{
//     console.log( y);
// }
// while(y < 7){
//     y++;                     // infinite loop {} not come after while loop, ; comes, y never increments
// }

let y = 0;
do{
    console.log( y);
    y++;
}
while(y < 7);       // ;, is semicolon optional to add , js engine automatically adds at the end


// break , continue works same as java

let p = 3;

switch( p ) {
    case(1):
        console.log("Monday");
        break;
    case(2):
        console.log("Tuesday");
        break;
    case(3):
        console.log("Wednesday");
        break;
    case(4):
        console.log("Thursday");
        break;
    default:
        console.log("Input is invalid");
        break;
}



