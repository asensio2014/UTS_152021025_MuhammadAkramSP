package com.example.tugas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.uts.MainActivity
import com.example.uts.MenuActivity
import com.example.uts.R
import com.example.uts.RegisterActivity

class LoginActivity : AppCompatActivity() {
    private var Register :Button? = null
    private var login: Button? = null
    private var username: EditText? = null
    private var password: EditText? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById<View>(R.id.username) as EditText
        password = findViewById<View>(R.id.password) as EditText
        login = findViewById<View>(R.id.login) as Button
        login!!.setOnClickListener { openmenu() }
        Register = findViewById(R.id.BtnRegis)
        Register!!.setOnClickListener { openregister() }
    }

    fun openregister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun openmenu() {
        if (username!!.text.toString() == "user" && password!!.text.toString() == "1234") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this@LoginActivity, "Login Failed", Toast.LENGTH_SHORT).show()
        }
    }


}
