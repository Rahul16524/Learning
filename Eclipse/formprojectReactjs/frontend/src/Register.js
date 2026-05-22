import { useState } from "react";
import axios from "axios";


export default function Register() {

    const [username, setUsername] = useState("HI");
    const [password, setPassword] = useState("no");
    const [message, setMessage] = useState("");

    function handleSubmit(e) {

        e.preventDefault();

        const user = {
            username: username,
            password: password
        }

        console.log(username);
        console.log(password);

        axios.post("http://localhost:8080/api/register",user)
            .then( response => {
                setMessage(response.data)
            })
            .catch(error => {
                setMessage("Error occured");
            });
    };
 
    function handleUsername(e){
        setUsername(e.target.value);
    }

    function handlePassword(e){
        setPassword(e.target.value);
    }

    return (
        <div>
            <h2>User Register</h2>

            <form onSubmit={handleSubmit}> 
                <input 
                    type="text"
                    placeholder="EnterUsername"
                    // value={username}     // then also it will work, data from form will be still be stored in backend
                                            // but we need any intial value defualt to be stored or impt
                                            // if again in event handler function, if because of any logic username got changes
                                            //       because of any reason, we want in the form updated value is been submitted
                                            //       so that both get sync, and updated in the backend is reached
                    onChange={handleUsername}
                    
                />
                <br/>
                <input  
                    type="password"
                    placeholder="Enter password"
                    // value={password}
                    onChange={handlePassword}
                />
                <br/>

                <button type="submit">Register</button>
            </form>

            <h3>{message}</h3>
        </div>
    )
} 



// import { useState } from "react";

// export default function Register() {

//     const [user, setUser] = useState({
//         username: "",
//         password: ""
//     });

//     function handleChange(e) {
//         const { name, value } = e.target;

//         setUser({
//             ...user,           // keep existing values
//             [name]: value      // update only changed field
//         });
//     }

//     function handleSubmit(e) {
//         e.preventDefault();
//         console.log(user);
//     }

//     return (
//         <div>
//             <h2>User Register</h2>

//             <form onSubmit={handleSubmit}>

//                 <input 
//                     type="text"
//                     name="username"
//                     placeholder="Enter Username"
//                     value={user.username}
//                     onChange={handleChange}
//                 />
//                 <br/>

//                 <input 
//                     type="password"
//                     name="password"
//                     placeholder="Enter Password"
//                     value={user.password}
//                     onChange={handleChange}
//                 />
//                 <br/>

//                 <button type="submit">Register</button>

//             </form>
//         </div>
//     );
// }