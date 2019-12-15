package com.soumik.android.validator

import android.text.TextUtils
import android.widget.EditText

class Validator {

    companion object{

        fun validateEmailandPassword(emailEditText:EditText,passwordEditText: EditText,minimumPasswordLength:Int):Boolean{
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            var state = false

            when{
                TextUtils.isEmpty(email)->emailEditText.error="Please Provide your email address"
                TextUtils.isEmpty(password)->passwordEditText.error="Please Provide your Password"
                !email.isValidEmail()->emailEditText.error="Please provide a valid email address"
                password.length<minimumPasswordLength->passwordEditText.error="Password must be at least $minimumPasswordLength characters long"
                else -> state = true
            }

            return state
        }

        fun validatePhoneandPassword(phoneEditText:EditText,passwordEditText: EditText,minimumPasswordLength:Int):Boolean{
            val phone = phoneEditText.text.toString()
            val password = passwordEditText.text.toString()

            var state = false

            when{
                TextUtils.isEmpty(phone)->phoneEditText.error="Please Provide your phone Number"
                TextUtils.isEmpty(password)->passwordEditText.error="Please Provide your Password"
                password.length<minimumPasswordLength->passwordEditText.error="Password must be at least $minimumPasswordLength characters long"
                else->state=true
            }

            return state
        }

        fun validateInputFields(editText1: EditText,editText2: EditText,editText3:EditText):Boolean{
            val et1 = editText1.text.toString()
            val et2 = editText2.text.toString()
            val et3 = editText3.text.toString()

            var state = false

            when{
                TextUtils.isEmpty(et1)->editText1.error="This field shouldn't be empty"
                TextUtils.isEmpty(et2)->editText2.error="This field shouldn't be empty"
                TextUtils.isEmpty(et3)->editText3.error="This field shouldn't be empty"
                else -> state = true
            }

            return state
        }

        fun validateInputFields(editText1: EditText,editText2: EditText,editText3:EditText,editText4:EditText):Boolean{
            val et1 = editText1.text.toString()
            val et2 = editText2.text.toString()
            val et3 = editText3.text.toString()
            val et4 = editText4.text.toString()

            var state:Boolean = false

            when{
                TextUtils.isEmpty(et1)->editText1.error="This field shouldn't be empty"
                TextUtils.isEmpty(et2)->editText2.error="This field shouldn't be empty"
                TextUtils.isEmpty(et3)->editText3.error="This field shouldn't be empty"
                TextUtils.isEmpty(et4)->editText4.error="This field shouldn't be empty"
                else-> state = true
            }

            return state
        }

        fun validateInputFields(editText1: EditText,editText2: EditText,editText3:EditText,editText4:EditText,editText5: EditText):Boolean{
            val et1 = editText1.text.toString()
            val et2 = editText2.text.toString()
            val et3 = editText3.text.toString()
            val et4 = editText4.text.toString()
            val et5 = editText5.text.toString()

            var state = false

            when{
                TextUtils.isEmpty(et1)->editText1.error="This field shouldn't be empty"
                TextUtils.isEmpty(et2)->editText2.error="This field shouldn't be empty"
                TextUtils.isEmpty(et3)->editText3.error="This field shouldn't be empty"
                TextUtils.isEmpty(et4)->editText4.error="This field shouldn't be empty"
                TextUtils.isEmpty(et5)->editText5.error="This field shouldn't be empty"
                else -> state = true
            }

            return state
        }

        fun validateRegistrationFields(nameET:EditText,phoneEditText: EditText,emailEditText: EditText,passwordEditText: EditText,confirmPasswordET:EditText,minimumPasswordLength: Int):Boolean{

            val name = nameET.text.toString()
            val phone = phoneEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordET.text.toString()

            var state = false

            when{
                TextUtils.isEmpty(name)->nameET.error="Please provide your Name"
                TextUtils.isEmpty(phone)->phoneEditText.error="Please provide a Phone Number"
                TextUtils.isEmpty(email)->emailEditText.error="Please provide an Email Address"
                !email.isValidEmail()->emailEditText.error="Please provide a valid Email Address"
                TextUtils.isEmpty(password)->passwordEditText.error="Please provide a Password"
                password.length<minimumPasswordLength->passwordEditText.error="Password must be at least $minimumPasswordLength characters long"
                password!=confirmPassword->confirmPasswordET.error="Password Doesn't match"
                else-> state = true
            }

            return state
        }

        fun String.isValidEmail():Boolean{
            return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
        }

    }

}