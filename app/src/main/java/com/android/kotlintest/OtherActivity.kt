package com.android.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputFilter
import kotlinx.android.synthetic.main.activity_main.*

class OtherActivity : AppCompatActivity() {

//    @BindView(R.id.btn) lateinit var btn: Button
//    @BindView(R.id.et) lateinit var et: EditText
//    @BindView(R.id.test) lateinit var test: StretchTextView
    //@BindView(R.id.content_main) lateinit var fragment: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toast.makeText(this, init(), Toast.LENGTH_LONG).show()
        btn.setOnClickListener {
            //            test.run {
//                changeTextSize(20f)
//                setText("haha")
//            }
            //val todoEditFragmnet = TodoEditFragment()
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.content_main, todoEditFragmnet, todoEditFragmnet.javaClass.simpleName)
//                    .addToBackStack(todoEditFragmnet.javaClass.simpleName)
//                    .commit()
        }
        et.setFilters(arrayOf<InputFilter>(NoEmojiInput()))
    }
}