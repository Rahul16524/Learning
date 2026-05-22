import './netflix-register.css'

export function NetflixRegister() {
    return (
        <div>
            <p> Ready to watch? Enter your email to create or restart your membership. </p>
            <div className="input-group input-group-lg " >
                
                <input type='email' placeholder="Email address" className='form-control'/>
                <button className='btn btn-danger'>
                    Get Started
                    <span className="bi bi-Chevron-right"></span>
                </button>
            </div>
            
        </div>
    )
}