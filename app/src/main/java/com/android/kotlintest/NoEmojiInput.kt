package com.android.kotlintest

import android.content.Context
import android.text.InputFilter
import android.text.Spanned
import android.text.TextUtils
import android.widget.Toast


/**
 * Created by Administrator on 2016/11/18.
 */
class NoEmojiInput : InputFilter {

    override fun filter(source: CharSequence, start: Int, end: Int, dest: Spanned, dstart: Int, dend: Int): CharSequence? {
        if (!TextUtils.isEmpty(source)) {
            val input = source.toString().replace(reg.toRegex(), "")
            if (!TextUtils.equals(input, source)) {
                println("shibai")
            }
            return input
        }
        return null
    }

    companion object {
        private val reg = "[^a-zA-Z0-9\u4E00-\u9FA5_;；,.!?:，。？！\r\n]"
    }
}
