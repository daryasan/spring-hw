package org.example

import org.example.bean.FloatGenerator
import org.example.component.IntGenerator
import org.example.conditional.Addition
import org.example.config.AppConfig
import org.springframework.beans.factory.getBeanProvider
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {



    val context = AnnotationConfigApplicationContext("org.example")

    // задание 1
    // создание бина с помощью @component
    val intBean = context.getBean(IntGenerator::class.java)
    println("Случайное целое число: ${intBean.generateNumber()}")

    // задание 2
    // создание бина с помощью @bean + @configuration
    val floatBean = context.getBean(FloatGenerator::class.java)
    println("Случайное число с точкой: ${floatBean.generateNumber()}")

    // задание 3
    val additionBean = context.getBean(Addition::class.java)
    println("Сумма двух случайных чисел: ${additionBean.add()}")


}