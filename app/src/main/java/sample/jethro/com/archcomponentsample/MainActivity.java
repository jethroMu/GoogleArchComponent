package sample.jethro.com.archcomponentsample;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import sample.jethro.com.archcomponentsample.viewmodel.MyViewModel;
import sample.jethro.com.archcomponentsample.viewmodel.TrailViewModel;
import sample.jethro.com.architecturecomponentsample.R;

public class MainActivity extends LifecycleActivity {
    TrailViewModel trailViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trailViewModel = ViewModelProviders.of(this).get(TrailViewModel.class);

        trailViewModel.getTrails().observe(this,trails -> {
            //  mAdapter.replaceItem(trails);
            //  mAdapter.notifiDataSetChanged();
        });
    }
}
