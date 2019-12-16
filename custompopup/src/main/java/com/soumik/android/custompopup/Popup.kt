package com.soumik.android.custompopup

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.custom_exit.*

class Popup {

    companion object {


        fun success(activity: Activity, heading: String, message: String, font: Int) {

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.custom_pop_up)
            val typeFace = ResourcesCompat.getFont(activity, font)
            val imageView = dialog.findViewById<ImageView>(R.id.a)
            imageView.setImageResource(R.drawable.ic_checked)

            val headingTV = dialog.findViewById<TextView>(R.id.b)
            headingTV.text = heading
            headingTV.setTextColor(Color.parseColor("#0DEB43"))
            headingTV.typeface = typeFace
            val titleTV = dialog.findViewById<TextView>(R.id.text_dialog)
            titleTV.text = message
            titleTV.typeface = typeFace

            val okButton = dialog.findViewById<Button>(R.id.btn_dialog)
            okButton.typeface = typeFace
            okButton.setOnClickListener { dialog.dismiss() }

            dialog.show()
        }

        fun error(activity: Activity, heading: String, message: String, font: Int) {

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.custom_pop_up)
            val typeFace = ResourcesCompat.getFont(activity, font)

            val imageView = dialog.findViewById<ImageView>(R.id.a)
            imageView.setImageResource(R.drawable.ic_red_alert)

            val headingTV = dialog.findViewById<TextView>(R.id.b)
            headingTV.text = heading
            headingTV.setTextColor(Color.parseColor("#E2574C"))
            headingTV.typeface = typeFace
            val titleTV = dialog.findViewById<TextView>(R.id.text_dialog)
            titleTV.text = message
            titleTV.typeface = typeFace

            val okButton = dialog.findViewById<Button>(R.id.btn_dialog)
            okButton.typeface = typeFace
            okButton.setOnClickListener { dialog.dismiss() }

            dialog.show()
        }

        fun customPopup(
            activity: Activity,
            heading: String,
            message: String,
            icon: Int,
            font: Int
        ) {

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.custom_pop_up)


            val typeFace = ResourcesCompat.getFont(activity, font)

            val imageView = dialog.findViewById<ImageView>(R.id.a)
            imageView.setImageResource(icon)

            val headingTV = dialog.findViewById<TextView>(R.id.b)
            headingTV.text = heading
            headingTV.setTextColor(Color.parseColor("#006064"))
            headingTV.typeface = typeFace
            val titleTV = dialog.findViewById<TextView>(R.id.text_dialog)
            titleTV.text = message
            titleTV.typeface = typeFace

            val okButton = dialog.findViewById<Button>(R.id.btn_dialog)
            okButton.typeface = typeFace
            okButton.setOnClickListener { dialog.dismiss() }

            dialog.show()
        }

        fun exit(activity: Activity, heading: String, subTitle: String) {

            val dialog = Dialog(activity)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(true)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.custom_exit)

            val headingTV = dialog.tv_heading
            headingTV.text = heading

            val titleTV = dialog.tv_sub_title
            titleTV.text = subTitle

            val ok = dialog.iv_ok
            ok.setOnClickListener {
                activity.finishAffinity()
                dialog.dismiss()
            }

            val cancel = dialog.iv_cancel
            cancel.setOnClickListener { dialog.dismiss() }

            dialog.show()
        }
    }
}