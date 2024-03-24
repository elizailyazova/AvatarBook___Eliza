package com.example.avatarbook___eliza.room;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Delete;
import androidx.room.Insert;

import com.example.avatarbook___eliza.models.Student;

import java.util.List;

public interface StudentDao {
    @Query("SELECT*FROM students")
    List <Student> getAll();
    @Insert
    void insert(Student student);

    @Delete
    void delete(Student student);
    @Update
    void update(Student student);

    @Query("SELECT*FROM students ORDER BY name_surname ASC")
    List <Student> sortAll();
}
