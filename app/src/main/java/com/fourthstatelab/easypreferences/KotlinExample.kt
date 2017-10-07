package com.fourthstatelab.easypreferences

import android.content.Context
import com.fourthstatelab.easypreference.Preference
import com.google.gson.reflect.TypeToken

/**
 * Created by sid on 7/10/17.
 */
class KotlinExample(val context : Context) {

    lateinit var preference : Preference
    val integer = "integer"
    val string = "String"
    val perstr1 = "Person1"
    val persons = "Persons"
    init {
        preference = Preference(context)
        putToDevice()
        getFromDevice()
    }

    fun putToDevice(){
        preference.put(integer,2)
        preference.put(string,"A String saved to device")
        preference.put(perstr1, Person("Sid",19,true))
        val persons = arrayOf(Person("Thanos", 20, true), Person("Shakira", 20, false))
    }

    fun getFromDevice(){
        var persons : Array<Person> = preference.get(persons,object : TypeToken<Array<Person>>(){})
    }
}