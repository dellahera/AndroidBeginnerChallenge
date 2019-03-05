package binar.app.common

import android.content.Context
import android.widget.Toast

fun Context.toastku(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT ).show()
}