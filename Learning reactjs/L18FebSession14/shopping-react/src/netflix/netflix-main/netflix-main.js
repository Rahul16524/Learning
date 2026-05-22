import './netflix-main.css';


import {NetflixRegister} from '../netflix-register/netflix-register.js'

export function NetflixMain() {
    return (
        <div className="text-white text-center mt-4">
            <h1> Unlimited movies, shows and more</h1>
            {/* <h1> shows, and more </h1> */}

            <h6> Starts at  Rs 149. Cancel at any time </h6>

            <NetflixRegister/>
        </div>
    )
}