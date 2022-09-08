import React from 'react'
import Add from "../img/addAvatar.png"
const Register = () => {
  return (
    <div className='form-container'> 
    <div className='formwrapper'>
        <span className='logo'>Whatsapp</span>
        <span className='tittle'>Register</span>
        <form>
            <input type="text" placeholder='display name'/>
            <input type="email" placeholder='email'/>
            <input type="password" placeholder='password'/>
            <input style={{display :"none"}}type="file" id="file" />
            <label htmlFor='file'>
            <img src={Add} alt="" />
            <span>Add an avatar</span>
            </label>
            <button>Sign Up</button>
        </form>
    <p>Account Holder?Login</p>
     </div>
    </div>
  )
}

export default Register
