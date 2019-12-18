package com.soumik.android.librarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soumik.android.custompopup.Popup
import com.soumik.android.toaster.Toaster
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toaster = Toaster()

        toaster.normal(this,"HELLOOO")

        button.setOnClickListener {

            if (com.soumik.android.validator.Validator.validateRegistrationFields(editText,editText2,editText3,editText4,editText5,6)){
                Popup.success(this,"Success","Yes! I have done it!!",R.font.comfortaa) }
            }


        button2.setOnClickListener { Popup.error(this,"Error","Shit! I couldn't do it",R.font.comfortaa) }

    }
}
