package com.example.curdroom;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

public interface StudentDao
{
    @Insert
    public void studentInsert(Student student);


    @Query("select * from students")
    public List<Student> getAllStudent();


    @Delete
    public void deleteStudentInfo(Student student);


    @Update
    public void updateStudentInfo(Student student);

}
