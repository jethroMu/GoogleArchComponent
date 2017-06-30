package sample.jethro.com.archcomponentsample.db;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by lin on 2017/6/28.
 */

@Database(entities = {Trail.class}, version = 1)
public abstract class TrailDataBase extends RoomDatabase {

    public abstract TrailDao trailDao();

}
