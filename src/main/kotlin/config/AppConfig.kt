package org.example.config

import org.example.bean.FloatGenerator
import org.example.component.IntGenerator
import org.example.conditional.Addition
import org.example.conditional.AdditionStub
import org.example.conditional.AdditionWithBeans
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class AppConfig {

    @Bean
    open fun floatGenerator() = FloatGenerator()

    @Bean
    @ConditionalOnProperty(
        value = ["module.enabled"],
        havingValue = "true"
    )
    open fun additionWithBeans(): Addition = AdditionWithBeans(IntGenerator(), FloatGenerator())

    @Bean
    @ConditionalOnProperty(
        value = ["module.enabled"],
        havingValue = "false",
        matchIfMissing = true
    )
    open fun additionStub(): Addition = AdditionStub()

}