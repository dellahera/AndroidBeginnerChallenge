package binar.app.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import binar.app.BinarApp
import binar.app.BuildConfig
import binar.app.R
import binar.app.adapter.SiswaAdapter
import binar.app.model.Siswa
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_recycler_view.*
import binar.app.common.toastku

class MainActivity : AppCompatActivity() {
    private val siswaList = mutableListOf<Siswa>()
    private val siswaAdapter = SiswaAdapter(siswaList, {
        toastku("Click ${it.name}")
    }, {
        toastku("Long Click ${it.name}")
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

//        tv1Hello.text = "Hello ${BinarApp.sp.nama}"
//        btnLogout.setOnClickListener {
//            BinarApp.sp.Logout()
//            startActivity(Intent(this, LoginActivity::class.java))
//            finish()
//        }
        setUpView()
        getSiswa()

    }

    private fun getSiswa() {
        val dataA= listOf<String>( "Lollipop", "Marshmallow","Nougat", "Nougat", "Oreo", "Oreo", "Pie")
        val versi= listOf<String>( "5.1", "6.0", "7.0", "7.1", "8.0", "8.1", "9.0")
        (0..6).forEach() { index ->
            val siswa = Siswa( "${dataA[index]}" , "Android version ${versi[index]}", 22+index)
            siswaList.add(siswa)
        }
        siswaAdapter.notifyDataSetChanged()
    }

    private fun setUpView() {
        rvBelajar.layoutManager = LinearLayoutManager(this)
        rvBelajar.adapter = siswaAdapter
    }
}
