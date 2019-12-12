package com.soumik.android.toaster

import android.content.Context
import android.widget.Toast

class Toaster{

    fun normal(context: Context,message:String){

        return Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }

}