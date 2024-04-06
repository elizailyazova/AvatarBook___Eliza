package com.example.avatarbook___eliza.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.avatarbook___eliza.models.Student;
@Database(entities = {Student.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract StudentDao studentDao();
}
