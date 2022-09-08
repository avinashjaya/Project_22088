import React from 'react'
const Login = () => {
  return (
    <div className='form-container'> 
    <div className='formwrapper'>
        <span className='logo'>Whatsapp</span>
        <span className='tittle'>Login</span>
        <form>
            <input type="email" placeholder='email'/>
            <input type="password" placeholder='password'/>

           
            <button>Sign In</button>
        </form>
    <p>You are not an Account Holder? Register</p>
     </div>
    </div>
  )
}

export default Login;
