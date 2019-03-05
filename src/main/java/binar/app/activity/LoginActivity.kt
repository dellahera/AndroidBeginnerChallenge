package binar.app.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import binar.app.BinarApp
import binar.app.R
import binar.app.common.Constant
import binar.app.data.PreferenceHelper
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupView()
    }

    private fun setupView() {
        btnLog.setOnClickListener {
            login()
        }
        back.setOnClickListener{
            startActivity(Intent(this, LauncherActivity::class.java))
        }
    }

    private fun login() {
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()
        val emaiil= etEmaiil.text.toString()
        val passwordd= etPassw.text.toString()
        if (email==emaiil&& password==passwordd){
            showMessage("Login sukses")
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
           showMessage("Username atau password salah")
        }
    }

    private fun showMessage(message: String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}
