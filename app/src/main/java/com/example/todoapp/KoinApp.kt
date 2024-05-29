package com.example.todoapp

import android.app.Application
import androidx.room.Room
import com.example.todoapp.database.ToDoDatabase
import com.example.todoapp.repositories.ToDoRepo
import com.example.todoapp.repositories.ToDoRepoImpl
import org.koin.core.context.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

// here we have the database builder. this is supposed to be in the room file

class KoinApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(module {
                single {
                    Room
                        .databaseBuilder(this@KoinApp, ToDoDatabase::class.java,"db")
                        .build()
                }
                single {
                    ToDoRepoImpl(database = get())
                } bind ToDoRepo::class
            })
        }
    }
}