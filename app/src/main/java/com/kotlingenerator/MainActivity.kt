package com.kotlingenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var person = Person()

        Log.e(Companion.TAG, "onCreate: ${person.name}", )
        Log.e(Companion.TAG, "onCreate: ${person.age}", )

        
        var friends = Friends("충호", 30)

        Log.e(TAG, "onCreate: ${friends.name}" )
        Log.e(TAG, "onCreate: ${friends.age}" )


        var friends2 = Friends("물개", 30, "인천")
        Log.e(TAG, "onCreate: ${friends2.name}" )
        Log.e(TAG, "onCreate: ${friends2.age}" )
        Log.e(TAG, "onCreate: ${friends2.address}" )


        var subjectScore_1 = SubjectScore(70, 80, 50)
        var subjectScore_2 = SubjectScore(70, 80)

        Log.e(TAG, "onCreate: ${subjectScore_1.국어}" )
        Log.e(TAG, "onCreate: ${subjectScore_1.영어}" )
        Log.e(TAG, "onCreate: ${subjectScore_1.수학}" )
        Log.e(TAG, "onCreate: ${subjectScore_2.국어}" )
        Log.e(TAG, "onCreate: ${subjectScore_2.영어}" )
        Log.e(TAG, "onCreate: ${subjectScore_2.수학}" )

    }

}