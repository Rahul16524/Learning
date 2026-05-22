// 25 Feb Session 22 Part 2 

import {useState} from "react";

// export function DataBinding3() {
//     // const () =  useState(""); //  not work
//     // const {} = useState("");  // works if it was returning an object of variable and function to update state/variable
//     // const [] = useState("");    // works, it is retuining a array of state, and function to update this state.

//     // const {userName, setUserName} = useState("John");  // not work, no error, but it not load the data John inside the form and variable
//     const [userName, setUserName] = useState("John");       // one way binding only, not updating to the state

//     return (
//         <div className="container-fluid">
//             <h2> One Way </h2>
//             User name: <input type="text" value={userName}/>
//             <p>
//                 Hello! {userName}
//             </p>
//         </div>
//     )
// }


// 2 - way binding example
// export function DataBinding3() {
//     // const () =  useState(""); //  not work
//     // const {} = useState("");  // works if it was returning an object of variable and function to update state/variable
//     // const [] = useState("");    // works, it is retuining a array of state, and function to update this state.

//     // const {userName, setUserName} = useState("John");  // not work, no error, but it not load the data John inside the form and variable
    
    
//     const [userName, setUserName ]    = useState();

//     function handleUserName(e) {
//         // alert();     // to check if everything is working fine or not
//         setUserName(e.target.value);
//     }

//     return (
//         <div className="container-fluid">
//             <h2> One Way </h2>
//             User name: <input type="text"   onKeyUp={handleUserName}/>
//             <p>
//                 Hello! {userName}
//             </p>
//         </div>
//     )
// }


// =====================
// 2 way binding more example
export function DataBinding3() {

    const [name, setName] = useState("");
    const [price, setPrice] = useState(0);
    const [city, setCity] = useState("");
    const [stock, setStock] = useState(false);


    function nameChange(e) {
        setName(e.target.value);
    }

    function priceChange(e) {
        setPrice(e.target.value);
    }

    function cityChange(e) {
        setCity(e.target.value)
    }

    function stockChange(e) {
        // setStock(e.target.value);
        setStock(e.target.checked); 
    }

    return (
        <div className="container-fluid">
            
            <div className="row">
                <div className="col-4">
                    
                    <h2>2-way binding more example</h2>
                    <div className="m-1">
                        <label>Name</label>
                        {/* Read only */}
                        {/* <input type="text" value={name} onKeyUp={function (e) { setName(e.target.value)}}/>      */}
                        {/* <input type="text" value={name} onChange={function (e) { setName(e.target.value)}}/> */}
                        <input type="text" value={name} onChange={nameChange}/>
                    </div>
    
                    <div className="m-1">
                        <label>Price</label>
                        {/* Read and write both */}
                        {/* <input type="text" value={price} onKeyUp={function(e) { setPrice(e.target.value)}}/> */}
                        {/* <input type="text" value={price} onChange={function(e) { setPrice(e.target.value)}}/> */}
                        <input type="text" value={price} onChange={priceChange}/>
                    </div>
    
                    <div className="m-1">
                        <label>City</label>
                        <select onChange={cityChange}>
                            <option>Delhi</option>
                            <option>Hyderabad</option>
                        </select>
                    </div>
    
    
                    <div className="m-1">
                        
                                        <label>Stock</label>
                                        <input type="checkbox" className="form-check-input" onChange={stockChange} />
                    </div> Available
                </div>

                <div className="col-8">
                    <h2>Details</h2>
                    <dl>
                        <dt>Name</dt>
                        <dd>{name}</dd>
                    </dl>
                    <dl>
                        <dt>Price</dt>
                        <dd >{price}</dd>
                    </dl>
                    <dl> 
                        <dt> City</dt>
                        <dd>{city}</dd> 
                    </dl>


                    <dl>
                        <dt>Stock</dt>
                        <dd >{stock==true? "Available" : "Out of Stock"}</dd>
                    </dl>
                </div>
            </div>
        </div>
    )
}
// session 16 completed here