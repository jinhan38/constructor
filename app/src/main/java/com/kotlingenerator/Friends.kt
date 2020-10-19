package com.kotlingenerator

import android.util.Log

class Friends(var name: String?, var age: Int?) {

    var address: String = ""

    /**
     * 기본 생성자
     */
    init {
        Log.e(Companion.TAG, "init 진입: ")
        this.name = "석민"
        this.age = 29
    }


    /**
     * 추가 생성자
     * 기본생성자인 name과 age까지만 넣어도 생성가능
     * 여기서 address를 추가로 넣었는데 address는 생성할 때 추가해도 되고 안해도 됨
     * 그래서 추가생성자
     */
    constructor(name: String?, age: Int?, address: String)
            : this(name, age) {
        this.address = address

    }

    companion object {
        private const val TAG = "Friends"
    }

}