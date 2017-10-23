# EasyPreferences
Sometimes you may need to save small details like username or isFirstTime(to show tutorial activity) 
to the android device so that you can retrieve it next time the user opens the app. EasyPreference does exactly this for you.
This is an android library to make saving and retrieving data from the device easier. Built on top of ```SharedPreferences```,
it has simplified functions for ```put``` and ```get``` functions used in  ```SharedPreferences``` and ```SharedPreferences.Editor```

## Download and compile
#### Gradle
```compile 'com.fourthstatelab.easypreference:easypreference:1.0.0'```
#### Maven 
```
<dependency>
  <groupId>com.fourthstatelab.easypreference</groupId>
  <artifactId>easypreference</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## Functions
###### (Examples in ```Kotlin``` and ```Java``` are included in app module of the project)

### Constructor
```Preference preference = new Preference(getApplicationContext());```

### Saving Primitive Datatypes and Objects
##### Usage ```preference.put(String key,E value);```
##### Example
```
Preference preference = new Preference(getApplicationContext());
preference.put("integerKey",2);
preference.put("stringKey","A String saved to device");
preference.put("booleanKey",true);

Person person1 = new Person("Sid",19,true);
preference.put(person1Str,person1);

Person[] persons = {new Person("Thanos",20,true),
                    new Person("Ultron",20,false)};
preference.put(personKey,persons);
```

### Retreiving Primitive Datatypes and String
##### Usage ```preference.get(String key,E defaultValue);```
##### Example
```
Preference preference = new Preference(getApplicationContext());
int integerFromDevice = preference.get("integerKey",0);
String StringFromDevice = preference.get("stringKey","Not Found");
boolean booleanFromDevice = preference.get("booleanKey",false);
```

### Retreiving objects of class/type
##### Usage ```preference.get(String key, TypeToken<E> type);```
##### Example
```
Preference preference = new Preference(getApplicationContext());
Person sid = preference.get(person1Str, new TypeToken<Person>(){});
Person[] persons = preference.get(personKey, new TypeToken<Person[]>(){});
```

## Development and Contribution
This repository contains the source code of easypreference library and examples.

## Development Setup
1. Go to the project repo and click the `Fork` button
2. Clone your forked repository : `https://github.com/sridharswain/EasyPreferences.git`
3. Move to android project folder `cd EasyPreferences/`
4. Open the project with Android Studio
5. The module easypreference contains the source-code of the library and module app contains the ```Java``` and ```Kotlin```
Examples

## How to build the example
1. Install Kotlin plugin
2. All dependencies are defined in ```EasyPreferences/app/build.gradle```. Import the project in Android Studio or use Gradle in command line:
```
./gradlew assembleRelease
```
The result apk file will be placed in ```EasyPreferences/app/build/outputs/apk/```.
