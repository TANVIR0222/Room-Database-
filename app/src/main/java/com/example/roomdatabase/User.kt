package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class User(
    @PrimaryKey(autoGenerate = true)
    
    val Uid:Int=0,
    @ColumnInfo(name = "NAME")
    
    var name: CharSequence,
    @ColumnInfo(name = "MOBILE")
    
    var mobile: CharSequence,
    @ColumnInfo(name = "EMAIL")
    
    var email: CharSequence
    
)
