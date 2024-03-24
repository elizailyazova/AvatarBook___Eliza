package com.example.avatarbook___eliza.room;

import androidx.room.RoomDatabase;

public abstract class AppDataBase extends RoomDatabase {
    public abstract StudentDao studentDao();
}
