// 27 Feb Session 17
// import {useEffect, useState} from 'react';

// export function UseEffectHookNasaComponent() {

//     // const [mars, setMars] = useState([]);         // use it as general approach
//     // const [mars, setMars] = useState({});

//     // function handleLoadClick() {
//     //     fetch("https://www.omdbapi.com/?s=man&&apikey=9c132aeb")
//     //     .then(response => response.json())
//     //     .then(data => {
//     //         setMars(data.Search);         // use it as general approach
//     //      }    
//     //     )
//     // }
//             function handleLoadClick() {        // shwowing error, cannot read properties from undefined map, also in jsx part analyse once again, 2 errors were coming see 2nd error also
//                 fetch("https://www.omdbapi.com/?s=man&&apikey=9c132aeb")
//                 .then(response => response.json())
//                 .then(data => {
//                     setMars(data);
//                  }
//                 )
//             }       

//     return (
//         <div className='container-fluid mt-3'>
//             <div>
//                 <h2>Mars Rover Photos   <button onClick={handleLoadClick}>Load Photos</button></h2>
//                 <table className='table table-hover'>
//                     <thead>
//                         <tr>
//                             <th>Photo Id</th>
//                             <th>Preview</th>
//                             <th>Camera</th>
//                             <th>Rover</th>
//                         </tr>
//                     </thead>

//                     {/* <tbody>
//                         {
//                             mars.map( item =>     // no error, even if array is empty, on operation no error will occur, map is used for array only not for object 
//                                 <tr key={item.imdbID}>
//                                     <td> {item.imdbID} </td>
//                                     <td> <img src={item.Poster}/></td>
//                                     <td> {item.Title} </td>
//                                     <td> {item.Year} </td>
//                                 </tr>
//                             )
//                         }
//                     </tbody> */}

//                     {/* causing error */}        
//                             <tbody>
//                                 {        because map we cannot use on objects, so error will occur
//                                     mars.Search.map( item =>     // mars.Search is undefined, and on map operation gives error
//                                         <tr key={item.imdbID}>
//                                             <td> {item.imdbID} </td>
//                                             <td> <img src={item.Poster}/></td>
//                                             <td> {item.Title} </td>
//                                             <td> {item.Year} </td>
//                                         </tr>
//                                     )
//                                 }
//                             </tbody>
//                 </table>
//             </div>
//         </div>
//     )


    
// }
// =====================================
// 2 March Session 17 part 2
import {useEffect, useState} from 'react';

import './useEffecthookSession17.css';
export function UseEffectHookNasaComponent() {

    const [mars, setMars] = useState([]);

            useEffect( () => {
                fetch("https://www.omdbapi.com/?s=man&&apikey=9c132aeb")
                .then(function(response) {
                    return response.json();
                })
                .then(function(data) {
                    setMars(data.Search);
                })
            }, []);

    return (
        <div className='container-fluid mt-3'>
            <div>
                <h2>Mars Rover Photos   </h2>
                <table className='table table-hover'>
                    <thead>
                        <tr>
                            <th>Photo Id</th>
                            <th>Preview</th>
                            <th>Camera</th>
                            <th>Rover</th>
                        </tr>
                    </thead>
                    
                            <tbody>
                                {
                                    mars.map( item =>  
                                        <tr key={item.imdbID}>
                                            <td> {item.imdbID} </td>
                                            <td> <img src={item.Poster}/></td>
                                            <td span="title"> {item.Title} </td>
                                            <td> {item.Year} </td>
                                        </tr>
                                    )
                                }
                            </tbody>
                </table>
            </div>
        </div>
    )
}

