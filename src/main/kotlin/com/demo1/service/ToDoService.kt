package com.demo1.service

import com.demo1.module.ToDo
import com.demo1.repository.ToDoRepository
import io.micronaut.core.annotation.NonNull
import jakarta.inject.Singleton
import jakarta.transaction.Transactional
import java.util.*

@Singleton
@Transactional
class ToDoService (private val toDoRepository : ToDoRepository){

    fun allToDos():List<ToDo>{
        return toDoRepository.findAll()
    }

    fun findToDoById(id:Int) : Optional<ToDo>? {
        return toDoRepository.findById(id)
    }

    fun saveToDo(toDo:ToDo) : ToDo{
        return toDoRepository.save(toDo)
    }

}