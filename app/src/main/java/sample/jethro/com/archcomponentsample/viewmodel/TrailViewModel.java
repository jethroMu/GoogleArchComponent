package sample.jethro.com.archcomponentsample.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

import java.util.List;

import sample.jethro.com.archcomponentsample.db.Trail;
import sample.jethro.com.archcomponentsample.db.TrailDataBase;

/**
 * Created by lin on 2017/6/30.
 */

public class TrailViewModel extends AndroidViewModel {
    
    TrailDataBase mDataBase;
    LiveData<List<Trail>> trails;
    
    public TrailViewModel(Application application) {
        super(application);
        mDataBase = Room.databaseBuilder(application,TrailDataBase.class,"trail").build();
        trails = mDataBase.trailDao().findAllTrails();
    }
    
    public LiveData<List<Trail>> getTrails(){
        return trails;
    }
}
