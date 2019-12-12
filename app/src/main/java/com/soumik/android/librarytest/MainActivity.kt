package com.soumik.android.librarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soumik.android.custompopup.PopUp
import com.soumik.android.toaster.Toaster
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toaster = Toaster()

        toaster.normal(this,"HELLOOO")

        button.setOnClickListener { PopUp.success(this,"Success","Yes! I have done it!!") }

        button2.setOnClickListener { PopUp.error(this,"Error","Shit! I couldn't do it") }
    }
}
