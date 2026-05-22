//  here in this case, on using Link, the page is not reloading,
                                    // only the url is updated and added at end to existing port no.

import {BrowserRouter, Routes, Route, Link} from 'react-router-dom';

export function TutorialComponent2() {
    return (
        <div>
            <h2>Tutorials - Web Technologies</h2>
            <p>type on url to search </p>

            <BrowserRouter>
                <section>
                    <nav>
                        <Link to="html">HTML</Link> <br></br>
                        <Link to="css">CSS</Link>
                    </nav>
                    <main >
                        <Routes>
                            <Route path='html' element={<div> <h3> HTML </h3> <p> It is a markup language </p></div>}></Route>
                            <Route path='css' element={<div> <h3> CSS </h3> <p> It defines styles for HTML </p></div>}></Route>
                        </Routes>
                    </main>
                
                    <h3> yes </h3>
                </section>
            </BrowserRouter>
            
        </div>
    );
}
