package com.example.mvc_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvc_design.Presenter.ILoginPresenter
import com.example.mvc_design.Presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun onLoginSuccess(message: String) {
        Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
    }

    internal lateinit var loginPresenter: ILoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        btn_login.setOnClickListener {
            loginPresenter.onLogin(edit_email.text.toString(), edit_password.text.toString())
        }
    }
}




