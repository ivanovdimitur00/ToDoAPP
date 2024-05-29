package com.example.todoapp.repositories

import com.example.todoapp.database.ToDoDatabase
import com.example.todoapp.database.ToDoEntity
import kotlinx.coroutines.flow.Flow

class ToDoRepoImpl(private val database: ToDoDatabase):ToDoRepo {
    private val dao = database.todoDao()

    override suspend fun getTodos(): Flow<List<ToDoEntity>> = dao.getTodos()
    override suspend fun addTodo(todo: ToDoEntity) = dao.addTodo(todo)
    override suspend fun updateTodo(todo: ToDoEntity) = dao.updateTodo(todo)
    override suspend fun deleteTodo(todo: ToDoEntity) = dao.deleteTodo(todo)
}