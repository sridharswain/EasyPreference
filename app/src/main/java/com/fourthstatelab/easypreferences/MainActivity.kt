package com.fourthstatelab.easypreferences

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import com.fourthstatelab.easypreference.Preference
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {

    lateinit var preference: Preference
    val boolean = "Boolean"
    val integer = "Integer"
    val string = "String"
    val person1Str = "Person1"
    val person2Str = "Person2"

    lateinit var k : KotlinExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        k=KotlinExample(applicationContext)

    }

    fun put(view : View) {
        k.putToDevice()
    }

    fun get(view: View) {
        k.getFromDevice()
    }

}
