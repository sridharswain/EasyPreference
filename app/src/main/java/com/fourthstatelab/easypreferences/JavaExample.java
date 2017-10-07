package com.fourthstatelab.easypreferences;

import android.content.Context;

import com.fourthstatelab.easypreference.Preference;

/**
 * Created by sid on 5/10/17.
 */

public class JavaExample {
    Preference preference;
    String bool = "Boolean";
    String integer = "Integer";
    String string = "String";
    String person1Str = "Person1";
    String person2Str = "Person2";

    JavaExample(Context context){
        preference = new Preference(context);
        Person person1 = new Person("Sid",21,true);
        int integer = 2;
        String string = "String";
        boolean b = true;
    }
}
