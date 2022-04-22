package com.example.retrofit.util

import android.content.Context
import android.widget.Toast

fun Context.showToast(msg: String) {
    Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
}