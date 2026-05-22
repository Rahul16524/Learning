import logo from './logo.svg';
import './App.css';

// import {TutorialComponent} from './components/tutorial/tutorial-component';
// import {TutorialComponent2} from './components/tutorial/tutorial-component-no-reload';
// import {TutorialComponent3} from './components/tutorial/tutorial-component-no-reload-wildcard';
import {TutorialComponent4} from './components/tutorial/tutorial-component-no-reload-wildcard-componentwise'

function App() {
  return (
    // <TutorialComponent/>

    // =========================
    // without reloading the page
    // <TutorialComponent2 />

    // =========================
    // adding some default home page /
    // <TutorialComponent3/>

    // =========================
    // adding component instead of markup, Login Register
    <TutorialComponent4/>
  );
}

export default App;
