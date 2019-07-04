package com.example.curdroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {User.class},version = 1)
public abstract class MyAppDatabase extends RoomDatabase

{
        public abstract MyDao myDao();


}
