package sample.jethro.com.archcomponentsample.presenter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;

import sample.jethro.com.archcomponentsample.base.BasePresenter;
import sample.jethro.com.archcomponentsample.contract.TrailContract;

/**
 * Created by lin on 2017/6/26.
 */

public class TrailPresenter extends BasePresenter<TrailContract.View> implements TrailContract.Presenter, LifecycleObserver {

    private Context mContext;

    public TrailPresenter(Context context, TrailContract.View view) {
        this.mContext = context;
        if (view instanceof LifecycleOwner) {
            ((LifecycleOwner) view).getLifecycle().addObserver(this);
        }
    }

    @Override
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void attachView(TrailContract.View mvpView) {
        super.attachView(mvpView);
    }

    @Override
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void detachView() {
        super.detachView();
    }


    @Override
    public void loadMusciData(String type, String key, String limit, String offset) {
        
    }
}
