package com.example.todoapp.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp.database.ToDoEntity
import com.example.todoapp.repositories.ToDoRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

// here we have the repository functions to the entity DAO. they should be in the repository implementation file

class HomeViewModel:ViewModel(),KoinComponent {
    private val repo:ToDoRepo by inject()

    private val _todos:MutableStateFlow<List<ToDoEntity>> = MutableStateFlow(emptyList())
    val todos = _todos.asStateFlow()

    init {
        getTodos()
    }

    private fun getTodos(){
        viewModelScope.launch(Dispatchers.IO) {
            repo.getTodos().collect{data -> _todos.update{data}
            }
        }
    }

    fun updateTodo(todo:ToDoEntity) {
        viewModelScope.launch(Dispatchers.IO){
            repo.updateTodo(todo)
        }
    }
    fun deleteTodo(todo:ToDoEntity) {
        viewModelScope.launch(Dispatchers.IO){
            repo.deleteTodo(todo)
        }
    }
    fun addTodo(todo:ToDoEntity) {
        viewModelScope.launch(Dispatchers.IO){
            repo.addTodo(todo)
        }
    }
}

