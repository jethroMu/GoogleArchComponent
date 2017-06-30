package sample.jethro.com.archcomponentsample.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by lin on 2017/6/30.
 */

public class SeekBarViewModel extends ViewModel{

    public MutableLiveData<Integer> seekbarValue = new MutableLiveData<>();

}
