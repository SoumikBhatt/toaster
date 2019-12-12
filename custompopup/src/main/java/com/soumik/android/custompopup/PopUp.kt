package com.soumik.android.custompopup

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PopUp {

    companion object{


        fun success(activity: Activity,heading:String,message:String){

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.custom_pop_up)

            val imageView = dialog.findViewById<ImageView>(R.id.a)
            imageView.setImageResource(R.drawable.ic_checked)

            val headingTV = dialog.findViewById<TextView>(R.id.b)
            headingTV.text=heading
            headingTV.setTextColor(Color.parseColor("#0DEB43"))
            val titleTV = dialog.findViewById<TextView>(R.id.text_dialog)
            titleTV.text=message

            val okButton = dialog.findViewById<Button>(R.id.btn_dialog)
            okButton.setOnClickListener { dialog.dismiss() }

            dialog.show()
        }

        fun error(activity: Activity,heading:String,message:String){

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.custom_pop_up)

            val imageView = dialog.findViewById<ImageView>(R.id.a)
            imageView.setImageResource(R.drawable.ic_red_alert)

            val headingTV = dialog.findViewById<TextView>(R.id.b)
            headingTV.text=heading
            headingTV.setTextColor(Color.parseColor("#E2574C"))
            val titleTV = dialog.findViewById<TextView>(R.id.text_dialog)
            titleTV.text=message

            val okButton = dialog.findViewById<Button>(R.id.btn_dialog)
            okButton.setOnClickListener { dialog.dismiss() }

            dialog.show()
        }

        fun customNotification(activity: Activity,heading:String,message:String,icon:Int) {

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.custom_pop_up)

            val imageView = dialog.findViewById<ImageView>(R.id.a)
            imageView.setImageResource(icon)

            val headingTV = dialog.findViewById<TextView>(R.id.b)
            headingTV.text=heading
            headingTV.setTextColor(Color.parseColor("#006064"))
            val titleTV = dialog.findViewById<TextView>(R.id.text_dialog)
            titleTV.text=message

            val okButton = dialog.findViewById<Button>(R.id.btn_dialog)
            okButton.setOnClickListener { dialog.dismiss() }

            dialog.show()
        }
    }
}