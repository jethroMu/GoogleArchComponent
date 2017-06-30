package sample.jethro.com.archcomponentsample;


import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.LifecycleRegistryOwner;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import sample.jethro.com.archcomponentsample.contract.TrailContract;
import sample.jethro.com.archcomponentsample.mode.Music;
import sample.jethro.com.archcomponentsample.presenter.TrailPresenter;

/**
 * Created by lin on 2017/6/27.
 */

public class MvpActivity extends AppCompatActivity implements LifecycleRegistryOwner, TrailContract.View {
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    TrailPresenter presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new TrailPresenter(this, this);
    }

    @Override
    public LifecycleRegistry getLifecycle() {
        return lifecycleRegistry;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void onLoadSuccess(List<Music.ResultBean.SongsBean> lists) {

    }
}
