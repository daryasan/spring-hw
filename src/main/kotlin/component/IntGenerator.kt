package org.example.component

import org.springframework.stereotype.Component

// задание 1
// bean созданный с помощью @component
@Component
open class IntGenerator {

    fun generateNumber(): Int {
        return (0..10).random()
    }

}