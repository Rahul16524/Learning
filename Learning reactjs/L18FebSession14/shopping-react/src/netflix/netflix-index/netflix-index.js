// In 23Feb Session 14 creating homen page of netflix page

// import './netflix-index.css'
// import background from './netflixback.jpg';

// export function NetflixIndex(){
//     return (
//         <div id='banner'>
//             <img src={background} alt='Image Not loaded'/>
//             <h1>Netflix index comp</h1>
//         </div>
//     )
// }
// =================
// preferred approach
import './netflix-index.css';

import { NetflixHeader } from '../netflix-header/netflix-header';

import {NetflixMain} from '../netflix-main/netflix-main.js'


export function NetflixIndex(){
    return (
        <div id='banner'>
            
            <div id="shade">
                {/* <h1>Netflix index comp</h1> */}
                <NetflixHeader/>
                <main>
                    <NetflixMain/>
                </main>
                
                
            </div>
        </div>
    )
}