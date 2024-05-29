package com.example.todoapp.repositories

import com.example.todoapp.database.ToDoEntity
import kotlinx.coroutines.flow.Flow

interface ToDoRepo {
    suspend fun getTodos():Flow<List<ToDoEntity>>
    suspend fun addTodo(todo:ToDoEntity)
    suspend fun updateTodo(todo: ToDoEntity)
    suspend fun deleteTodo(todo: ToDoEntity)
}