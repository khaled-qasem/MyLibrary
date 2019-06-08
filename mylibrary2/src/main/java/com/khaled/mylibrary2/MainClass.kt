package com.khaled.mylibrary2

import android.util.Log

class MainClass {
    val variable: LibClass? = null

    fun cal() {
        val x = "this is just for testing"
        Log.d(MainClass::class.java.simpleName, x)
    }
}