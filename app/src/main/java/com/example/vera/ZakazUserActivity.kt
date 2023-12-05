package com.example.vera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class ZakazUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zakaz_user)


    }

    fun btn(view: View) {
        val email : EditText = findViewById(R.id.emailUser)
        val phone : EditText = findViewById(R.id.phoneUser)
        val fame : EditText = findViewById(R.id.famUser)
        val name : EditText = findViewById(R.id.namUser)
        val otch : EditText = findViewById(R.id.otchUser)
        val emailP:String = email.text.toString()
        val phoneP:String = phone.text.toString()
        val fameP:String = fame.text.toString()
        val nameP:String = name.text.toString()
        val otchP:String = otch.text.toString()
        if(emailP == ""){
        val toast: Toast = Toast.makeText(baseContext,R.string.no, Toast.LENGTH_SHORT)
        toast.show()
        email.requestFocus()}
    else if(phoneP == ""){
        val toast: Toast = Toast.makeText(baseContext,R.string.no, Toast.LENGTH_SHORT)
        toast.show()
        phone.requestFocus()}
    else if(fameP == ""){
        val toast: Toast = Toast.makeText(baseContext,R.string.no, Toast.LENGTH_SHORT)
        toast.show()
        fame.requestFocus()}
    else if(nameP == ""){
        val toast: Toast = Toast.makeText(baseContext,R.string.no, Toast.LENGTH_SHORT)
        toast.show()
        name.requestFocus()}
    else if(otchP == ""){
        val toast: Toast = Toast.makeText(baseContext,R.string.no, Toast.LENGTH_SHORT)
        toast.show()
        otch.requestFocus()}
    else { val toast: Toast = Toast.makeText(baseContext,R.string.yes, Toast.LENGTH_SHORT)
        toast.show()
            finish()}

    }
}