package org.example.conditional

import org.example.bean.FloatGenerator
import org.example.component.IntGenerator

class AdditionStub : Addition {

    override fun add(): Float {
        println("Sorry, this is stub!")
        return 0f
    }
}