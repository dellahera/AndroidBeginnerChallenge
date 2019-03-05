package binar.app

import android.app.Application
import binar.app.data.PreferenceHelper

class BinarApp : Application(){

    companion object {
        lateinit var sp:PreferenceHelper
    }

    override fun onCreate() {
        super.onCreate()
        sp= PreferenceHelper(this)
    }
}