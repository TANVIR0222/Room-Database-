package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ). allowMainThreadQueries().build()
        
        binding.button.setOnClickListener {
            val name =binding.Semail.text.trim()
            val email=binding.Semail.text.trim()
            val mobile=binding.Semail.text.trim()
            
            var user= User(name = name, email = email, mobile = mobile)
            
            db.userDao().insert(user)
        }
    }
}