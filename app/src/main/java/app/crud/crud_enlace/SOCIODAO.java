package app.crud.crud_enlace;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


@Dao
public interface SOCIODAO {

    @Query("SELECt * FROM SOCIOS")
    List<SOCIOS> getAll();

    @Query("UPDATE SOCIOS SET nombre = :n,edad = :e, telefono = :t  WHERE id =:id")
    void update(String n, String e,String t, int id);

    @Query("Delete from SOCIOS WHERE id =:id")
    void delete(int id);

    @Insert
    Long insert(SOCIOS SOCIOS);
}
