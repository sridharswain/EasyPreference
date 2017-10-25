package com.fourthstatelab.easypreferences

import android.content.Context
import android.util.Log
import com.fourthstatelab.easypreference.Preference
import com.google.gson.reflect.TypeToken

/**
 * Created by sid on 7/10/17.
 */
class KotlinExample(val context : Context) {

    var preference: Preference
    var bool = "Boolean"
    var integer = "Integer"
    var string = "String"
    var person1Str = "Person1"
    var personKey = "person"
    init {
        preference = Preference(context)

        //putToDevice()
        //getFromDevice()
    }

    public fun putToDevice(){
        preference.put(integer, 2)
        preference.put(string, "A String saved to device")
        preference.put(bool, true)

        val person1 = Person("Sid", 19, true)
        preference.put(person1Str, person1)

        val persons = arrayOf(Person("Thanos", 20, true), Person("Shakira", 20, false))

        preference.put(personKey, persons)
    }

    fun getFromDevice(){
        val integerFromDevice = preference.get(integer, 0)
        val StringFromDevice = preference.get(string, "Not Found")
        val sid = preference.get<Person>(person1Str, object : TypeToken<Person>() {}.type)
        val persons = preference.get<Array<Person>>(personKey, object : TypeToken<Array<Person>>() {}.type)
        Log.d(integer, integerFromDevice.toString())
        Log.d(string, StringFromDevice)
        Log.d(person1Str + "'s name", sid!!.name)
        Log.d("persons[0]'s name", persons!![0].name)

    }
}