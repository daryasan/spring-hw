package org.example.bean

import java.time.LocalDateTime
import kotlin.random.Random

// задание 2
// компонент, генерируемый с помощью @bean + @configuration
class FloatGenerator {

    fun generateNumber(): Float {
        return Random(LocalDateTime.now().second).nextFloat() * 10
    }

}