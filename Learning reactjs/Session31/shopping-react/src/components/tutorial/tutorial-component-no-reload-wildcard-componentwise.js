//  here in this case, on using Link, the page is not reloading,
                                    // only the url is updated and added at end to existing port no.

    // here we are configuring default home page, what to show

        //  the return markup as a component, Login and register
import {BrowserRouter, Routes, Route, Link} from 'react-router-dom';

import {LoginComponent} from '../Login.js';
import {RegisterComponent} from '../register.js';

export function TutorialComponent4() {
    return (
        <div className='container-fluid'>
            <h2>Tutorials - Web Technologies</h2>
            <p>type on url to search </p>

            <BrowserRouter>
                <section>
                    <nav>
                        <div>
                            <Link to="/login">Login</Link> <br/>
                            <Link to="/register">Register</Link>
                        </div>
                
                        
                    </nav>

                    
                    <main >
                        <Routes>
                            <Route path="/login" element={<LoginComponent/>}></Route>
                            <Route path="/register" element={<RegisterComponent/>}></Route>
                        </Routes>
                    </main>
                
                    <h3> yes </h3>
                </section>
            </BrowserRouter>
            
        </div>
    );
}
