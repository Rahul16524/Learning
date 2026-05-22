// this apporach we have to reload the page, and
// manually type the path in the url, 

// we can return markup or component in the element

import {BrowserRouter, Routes, Route} from 'react-router-dom';

export function TutorialComponent() {
    return (
        <div>
            <h2>Tutorials - Web Technologies</h2>
            <p>type on url to search </p>


            <BrowserRouter>
                <Routes>
                    <Route path='html' element={<div> <h3> HTML </h3> <p> It is a markup language </p></div>}></Route>
                    <Route path='css' element={<div> <h3> CSS </h3> <p> It defines styles for HTML </p></div>}></Route>
                </Routes>
            </BrowserRouter>
        </div>
    );
}
