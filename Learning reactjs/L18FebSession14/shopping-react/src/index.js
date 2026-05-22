import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';

// add this 2 lines
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import 'bootstrap-icons/font/bootstrap-icons.css';   // bootstrap is ready to use

// L23Feb session 14 netflix
import {NetflixIndex} from './netflix/netflix-index/netflix-index.js';

import App from './App';
import reportWebVitals from './reportWebVitals';

// added for L24 Feb session 15
// import {DataBindingComponent} from './components/data-binding/data-binding.component.js'

// added for L24 Feb session16
// import { DataBinding2 } from './components/data-binding25Feb/data-binding.component2.js';
// import { DataBinding2 } from './components/data-binding25Feb/data-binding.component2practice.js';

// ==============
import {DataBinding3} from './components/data-binding25Feb/useStatehook.js'


// ==================
import { UseEffectHookNasaComponent } from './components/data-binding25Feb/useEffecthookSession17.js';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  // 
  // <React.StrictMode>
  //   {/* <App /> */}
  //   {/* added LoginComponent */}
  //   <LoginComponent></LoginComponent> 
  // </React.StrictMode> 

// ===================
// 23 Feb Session 14 Netflix home page
  <React.StrictMode>
    {/* <App /> */}
    {/* added netflix-index component*/}
    {/* <NetflixIndex/> */}


    {/* L24Feb Session 15 DataBinding */}
    {/* <DataBindingComponent/> */}


{/*  L25Feb Session 16 Databinding(Two Way) */}
    {/* <DataBinding2 /> */}


    {/* L25Feb Session16 Databinding3 using useState */}
    {/* <DataBinding3/> */}

    {/* =================================== */}
    <UseEffectHookNasaComponent/>

  </React.StrictMode> 

);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
