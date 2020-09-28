package com.clf.module_main.ui.kotlin

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View

import com.clf.module_main.R
import com.clf.module_main.ui.BottomActivity
import com.clf.module_main.ui.GuideActivity
import com.clf.module_main.ui.main3.Main3Activity
import com.gyf.immersionbar.BarHide
import com.gyf.immersionbar.ImmersionBar

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        ImmersionBar.with(this)
                .titleBar(findViewById<View>(R.id.top_view))
                .hideBar(BarHide.FLAG_HIDE_NAVIGATION_BAR)
                .init()

//        GuideActivity.start(this);
//        Main2Activity.start(this);
        Main3Activity.start(this);

//        BottomActivity.start(this);
//        finish()


        Gretter().gree("ccc")

        fun sum(a: Int, b: Int) = a + b

        val sum = sum(10, 3)
        printSum(1, 1)


    }
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }
    class Gretter() {
        fun gree(nam: String) {

            print(nam)
        }
    }
    fun printSum(a: Int, b: Int): Unit {
        print(a + b)
    }


}
