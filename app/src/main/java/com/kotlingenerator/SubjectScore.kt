package com.kotlingenerator

class SubjectScore(var 국어: Int, var 영어: Int) {

    //멤버변수
    var 수학: Int? = null

    //기본생성자 먼저 호출
    init {
        this.수학 = 0
    }


    //추가생성자, 기본생성자 호출 후에 호출됨
    //국어와 영어는 반드시 매개변수로 넣어야하고, 수학은 넣어도되고 안넣어도 됨
    constructor(국어: Int, 영어: Int, 수학: Int) : this(국어, 영어) {
        this.수학 = 수학

    }



}