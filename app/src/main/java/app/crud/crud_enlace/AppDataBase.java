package app.crud.crud_enlace;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SOCIOS.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract SOCIODAO empleadoDao();
}
