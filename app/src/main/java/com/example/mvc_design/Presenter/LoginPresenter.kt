package com.example.mvc_design.Presenter

import com.example.mvc_design.MainActivity
import com.example.mvc_design.Model.User

class LoginPresenter(internal var iLoginView: MainActivity) : ILoginPresenter {
    override fun onLogin(email : String, password : String) {
        val user = User(email,password)
        val isLoginSuccess = user.isDataValid
        if(isLoginSuccess)
            iLoginView.onLoginSuccess("Login Success")
        else
            iLoginView.onLoginSuccess("Login error")


    }

}