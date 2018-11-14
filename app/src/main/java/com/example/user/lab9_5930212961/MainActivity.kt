package com.example.user.lab9_5930212961

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.csitgis.lab9_kotlin.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val KEY_DATA_STUDENT = "keyDataStudent"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        S_btn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            val test=" "
            var str:String = ""
            if (maleID.isChecked==true) {
                str = "male"
            } else if(femaleID.isChecked==true) {
                str = "female"
            }
            val  dataStudent = Student(
                editName.text.toString(),
                editPass.text.toString(),
                editBirth.text.toString(),
                str,
                editEmail.text.toString(),
                editPhone.text.toString() )




            intent.putExtra(KEY_DATA_STUDENT, dataStudent)
            startActivity(intent)
        }
    }
}