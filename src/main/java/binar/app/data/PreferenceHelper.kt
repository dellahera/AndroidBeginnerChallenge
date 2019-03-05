package binar.app.data

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.view.Display
import binar.app.common.Constant

class PreferenceHelper(app: Application){
    private val sp: SharedPreferences by lazy {
        app.getSharedPreferences("My_Binar_App", Context.MODE_PRIVATE)
    }
    private val spe: SharedPreferences.Editor by lazy {
        sp.edit()
    }
    fun putString(key: String, value: String){
        spe.putString(key, value).apply()
    }
     fun getString(key: String): String?{
         return sp.getString(key,"")?:""
     }

    fun Logout(){
        spe.clear().apply()
    }
    lateinit var nama : String
        lateinit var email: String
            var passss: String
    set(value) {
        spe.putString(Constant.NAMA, value).apply()
    }
    get()=  sp.getString(Constant.NAMA,"")?:""
}