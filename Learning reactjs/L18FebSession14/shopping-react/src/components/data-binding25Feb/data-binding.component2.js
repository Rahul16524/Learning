// 25 Feb Session 22 Part 1
// export function DataBinding2(){
//     var username = "John";
//     return (
//         <div className="container-fluid">
//             <h2> One Way </h2>
//             User Name : <input type="text" value={username} />

//             <p>
//                 Hello! {username}
//             </p>

            
//         </div>
//     )
// }

export function DataBinding2() {
  let count = 0;

  function handleClick() {
    count++;
    console.log(count);
  }

  return (
    <div>
      <h2>{count}</h2>
      <button onClick={handleClick}>Increase</button> 
    </div>
  );
}
