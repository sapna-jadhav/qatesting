package com.twobulls.qatestandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openFoo(view: View) {
        startActivity(Intent(this, FooActivity::class.java))
    }

    fun openBar(view: View) {
        startActivity(Intent(this, FooActivity::class.java))
    }
}
