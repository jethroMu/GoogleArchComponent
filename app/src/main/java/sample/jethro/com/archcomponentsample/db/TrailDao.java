package sample.jethro.com.archcomponentsample.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.database.Cursor;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by lin on 2017/6/28.
 */
@Dao
public interface TrailDao {

    @Query("SELECT * FROM trail")
    List<Trail> getAll();

    @Query("SELECT * FROM trail")
    LiveData<List<Trail>> findAllTrails();

    @Query("SELECT * FROM trail WHERE uid IN (:userIds)")
    List<Trail> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM trail WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    Trail findByName(String first, String last);

    @Insert
    void insertAll(Trail... trails);

    @Delete
    void delete(Trail user);



    @Query("SELECT first_name, last_name FROM trail WHERE region IN (:regions)")
    public LiveData<List<Trail>> loadUsersFromRegionsSync(List<String> regions);



    @Query("SELECT * from trail where uid = :id LIMIT 1")
    public Flowable<Trail> loadUserById(int id);


    @Query("SELECT * FROM trail WHERE age > :minAge LIMIT 5")
    public Cursor loadRawUsersOlderThan(int minAge);


}
