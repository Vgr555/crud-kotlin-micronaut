package com.demo1.repository

import com.demo1.module.ToDo
import io.micronaut.data.repository.CrudRepository

interface ToDoRepository : CrudRepository<ToDo, Int> {
}