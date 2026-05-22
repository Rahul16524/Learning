import './login.component.css';
export function LoginComponent() {
    return (
        // Example 1 finished
        // <div className="m-3 p-2 border w-50 "> 
        //     <form>
        //         <dd className="bi bi-person">Register</dd>

        //         <dt>Login</dt>
        //         <dd><input type="text"></input></dd>

        //         <dt>Password</dt>
        //         <dd><input type="text"></input></dd>
        //     </form>
        // </div>
// ==============================================================
        // Example 2 

        <div id="form-container" className="container-fluid">
            <form>
                <h2> <span className="bi bi-person-fill "></span> User Login </h2>

                <div className="mb-2">
                    <label className="form-label"> UserName</label>
                    <div><input type="text" className="form-control"/></div>
                </div>
                

                
                <div className="mb-2">
                    <label className="form-label"> Password </label>
                    <div><input type="password" className="form-control"/> </div>
                </div>

                <div><button className="btn btn-primary w-100"> Login</button></div>
                {/* w-100 is 100 % of parent form tag width  */}
            </form>
        </div>
    )
}