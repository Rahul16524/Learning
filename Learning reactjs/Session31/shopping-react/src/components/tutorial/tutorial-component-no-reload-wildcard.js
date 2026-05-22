//  here in this case, on using Link, the page is not reloading,
                                    // only the url is updated and added at end to existing port no.

    // here we are configuring default home page, what to show
import {BrowserRouter, Routes, Route, Link} from 'react-router-dom';

export function TutorialComponent3() {
    return (
        <div className='container-fluid'>
            <h2>Tutorials - Web Technologies</h2>
            <p>type on url to search </p>

            <BrowserRouter>
                <section>
                    <nav>
                        <Link to="/"></Link> <br/>
                
                        <Link to="html">HTML</Link> <br></br>
                        <Link to="css">CSS</Link>
                    </nav>

                    
                    <main >
                        <Routes>
                            <Route path='/' element={<p>currently at home page</p>}>   </Route>

                            <Route path='html' element={<div> <h3> HTML </h3> <p> It is a markup language </p></div>}></Route>
                            <Route path='css' element={<div> <h3> CSS </h3> <p> It defines styles for HTML </p></div>}></Route>

                            {/* <Route path='*' element={<div> <p>enter url does not match with any path and so the content cannot be displayed</p> </div>}></Route> */}
                            <Route path='*' element={ <code> 404 : Page you requested not found </code> }></Route>
                        </Routes>
                    </main>
                
                    <h3> yes </h3>
                </section>
            </BrowserRouter>
            
        </div>
    );
}
