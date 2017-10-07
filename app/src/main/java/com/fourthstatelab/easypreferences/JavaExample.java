package com.fourthstatelab.easypreferences;

import android.content.Context;
import android.util.Log;
import com.fourthstatelab.easypreference.Preference;
import com.google.gson.reflect.TypeToken;


/**
 * Created by sid on 5/10/17.
 */

public class JavaExample {
    Preference preference;
    String bool = "Boolean";
    String integer = "Integer";
    String string = "String";
    String person1Str = "Person1";
    String personKey = "person";

    JavaExample(Context context){
        preference = new Preference(context);
        putToDevice();
        getFromDevice();


    }

    private void putToDevice(){
        preference.put(integer,2);
        preference.put(string,"A String saved to device");
        preference.put(bool,true);

        Person person1 = new Person("Sid",19,true);
        preference.put(person1Str,person1);

        Person[] persons = {new Person("Thanos",20,true),
                            new Person("Shakira",20,false)};

        preference.put(personKey,persons);
    }

    private void getFromDevice(){
        int integerFromDevice = preference.get(integer,0);
        String StringFromDevice = preference.get(string,"Not Found");
        Person sid = preference.get(person1Str, new TypeToken<Person>(){});
        Person[] persons = preference.get(personKey, new TypeToken<Person[]>(){});
        Log.d(integer,String.valueOf(integerFromDevice));
        Log.d(string,StringFromDevice);
        Log.d(person1Str+"'s name",sid.getName());
        Log.d("persons[0]'s name",persons[0].getName());
    }
}
