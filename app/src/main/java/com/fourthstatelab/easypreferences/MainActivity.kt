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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        preference = Preference(applicationContext)

        val j = JavaExample(applicationContext)
        val k = KotlinExample(applicationContext)

    }

    fun put(view : View) {
        preference.put(integer, 3)
        preference.put(boolean, true)
        preference.put(string, "HEllo Wolrd")
        var person1 : Person = Person("Sid",19,true)
        val person2 = Person("Tina",20,false)

        preference.put(person1Str,person1)
        preference.put(person2Str,person2)
    }

    fun get(view: View) {
        Log.d("Integer",((preference.get(integer,2)).toString()))
        Log.d("Boolean",preference.get(boolean,false).toString())
        Log.d(string,preference.get(string,null))
        var person1 :Person = preference.get(person1Str,object : TypeToken<Person>(){})
        Log.d(person1Str,person1.name)
        val person2 = preference.get(person2Str,object  : TypeToken<Person>(){})
        Log.d(person2Str,person2.name)
    }

}
