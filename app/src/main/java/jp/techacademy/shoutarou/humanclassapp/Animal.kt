package jp.techacademy.shoutarou.humanclassapp

abstract class Animal {

    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // 抽象関数
    abstract fun say()
}