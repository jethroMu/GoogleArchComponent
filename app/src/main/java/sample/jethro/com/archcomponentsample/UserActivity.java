package sample.jethro.com.archcomponentsample;

import android.arch.lifecycle.LifecycleActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.List;

import sample.jethro.com.archcomponentsample.mode.User;
import sample.jethro.com.archcomponentsample.viewmodel.UserViewModel;

/**
 * Created by lin on 2017/6/27.
 */

public class UserActivity extends LifecycleActivity {

    UserViewModel userViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userViewModel = ViewModelProviders.of(this).get(UserViewModel.class);
       
       
        userViewModel.getUsers().observe(this, users -> {
            //更新ui
        });
        
    }
}
