package com.soywiz.lib1

expect class Sample1(test: Int) {
    val demo: Int
}

fun Sample1() = Sample1(10)
