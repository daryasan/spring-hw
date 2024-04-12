package org.example.conditional

import org.example.bean.FloatGenerator
import org.example.component.IntGenerator
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Conditional


@ConditionalOnBean(IntGenerator::class)
open class AdditionWithBeans(
    val intGenerator: IntGenerator,
    val floatGenerator: FloatGenerator
) : Addition {

    override fun add(): Float {
        return intGenerator.generateNumber() + floatGenerator.generateNumber()
    }

}