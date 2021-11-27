package com.charlie.mvc.model

class MvcModel {

    private val list = listOf<String>("안녕!", "하이!", "안녕하세요", "반가워요!")

    fun hello(): String {
        return list[(list.indices).random()]
    }
}