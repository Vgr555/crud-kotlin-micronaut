package com.demo1.module

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
data class ToDo(
    @Id
    @GeneratedValue(GeneratedValue.Type.IDENTITY)
    val id:Int? = null,
    val title:String,
    val completed:Boolean = false
)
