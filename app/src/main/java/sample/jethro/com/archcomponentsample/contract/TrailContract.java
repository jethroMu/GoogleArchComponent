package sample.jethro.com.archcomponentsample.contract;


import java.util.List;

import sample.jethro.com.archcomponentsample.base.BaseView;
import sample.jethro.com.archcomponentsample.mode.Music;

/**
 * Created by lin on 2016/8/2.
 */
public interface TrailContract {

    interface View extends BaseView {
        void onLoadSuccess(List<Music.ResultBean.SongsBean> lists);
    }

    interface Presenter {
        void loadMusciData(String type, String key, String limit, String offset);
    }
}
