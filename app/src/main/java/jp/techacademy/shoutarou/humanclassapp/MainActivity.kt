package jp.techacademy.shoutarou.humanclassapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // インスタンス生成
        val human1 = Human("Sho",25,"reading")
        val human2 = Human("Sakura",28,"gaming")

        // 各インスタンスのメソッドの呼び出し
        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}
