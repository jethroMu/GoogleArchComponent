package sample.jethro.com.archcomponentsample.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import sample.jethro.com.archcomponentsample.mode.User;

/**
 * Created by lin on 2017/6/27.
 */

public class UserViewModel extends ViewModel {


    private MutableLiveData<List<User>> users;
    
    public LiveData<List<User>> getUsers() {
        if (users == null) {
            users = new MutableLiveData<List<User>>();
            loadUsers();
        }
        return users;
    }

    private void loadUsers() {
        // 执行异步操作获取用户
    }
}
