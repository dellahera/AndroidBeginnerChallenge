package binar.app.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import binar.app.BinarApp
import binar.app.BuildConfig
import binar.app.R
import binar.app.adapter.SiswaAdapter
import binar.app.common.toastku
import binar.app.model.Siswa
import binar.app.model.User
import kotlinx.android.synthetic.main.activity_recycler_view.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    var LogUser=User(etEmaiil.text.toString(), etPassw.text.toString())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setupView()
    }

    private fun setupView(){
        btnReg.setOnClickListener {
            regis()
        }
        backID.setOnClickListener{
            startActivity(Intent(this, LauncherActivity::class.java))
        }
    }
   fun regis(){
        val pass1= etPassw.text.toString()
        val kpass1= etKPass.text.toString()
        if(pass1 == kpass1){
            showMessage("Registrasi Sukses")
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        else showMessage("Password dan Konfirm Password Berbeda")
    }
    private fun showMessage(msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}