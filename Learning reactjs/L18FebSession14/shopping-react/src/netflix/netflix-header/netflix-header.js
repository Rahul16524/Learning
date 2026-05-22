import  './netflix-header.css';


export function NetflixHeader() {
    return (
        <div className='header'>
            
            {/* <h1 id='right-section'>NETFLIX</h1> */}

            {/* <select name="fruits" id='fruits'>
                <option value="english">English</option>
                <option value="hindi">Hindi</option>
                <option value="tamil">Tamil</option>
            </select>

            <button >Sign In</button> */}

            <div>
                <div className="brand-title"> Netflix</div>
            </div>

{/* keep side by side */}
            <div >
                <div className="input-group">
                    <span className="bi bi-globe input-group-text"></span>
                    <select className="form-select">
                        <option>Language</option>
                        <option>English</option>
                        <option>Hindi</option>
                    </select>
                
                <div className="ms-4">
                    <button className='btn btn-danger'>Sign In</button>
                </div>
                </div>
            </div>
        </div>
    )
}