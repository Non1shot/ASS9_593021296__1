package com.example.user.lab9_5930212961

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.csitgis.lab9_kotlin.Student
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val Bbtn = findViewById<Button>(R.id.b_back)
        Bbtn.setOnClickListener {

            startActivity(Intent(this@SecondActivity, MainActivity::class.java))
        }
        val receiveData = intent.extras.getParcelable(MainActivity.KEY_DATA_STUDENT)as Student

        text_view_result_user.text = "Username : ${receiveData.username}"
        text_view_result_pass.text = "Password : ${receiveData.pass}"
        text_view_result_birth.text = "BirthDay : ${receiveData.birth}"
        text_view_result_gender.text = "Gender : ${receiveData.gen}"
        text_view_result_email.text = "Email : ${receiveData.email}"
        text_view_result_phone.text = "Phone : ${receiveData.phone}"
    }
}
