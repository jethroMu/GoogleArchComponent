package sample.jethro.com.archcomponentsample;

import android.arch.lifecycle.LifecycleActivity;
import android.os.Bundle;

import sample.jethro.com.architecturecomponentsample.R;

/**
 * Created by lin on 2017/6/30.
 */

public class SeekBarActivity extends LifecycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seek);
    }

}
