package sample.jethro.com.archcomponentsample;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import sample.jethro.com.archcomponentsample.viewmodel.SeekBarViewModel;
import sample.jethro.com.architecturecomponentsample.R;

/**
 * Created by lin on 2017/6/30.
 */

public class SeekFragment extends Fragment {

    private SeekBar mSeekBar;

    private SeekBarViewModel mSeekBarViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_seek, container, false);
        mSeekBar = (SeekBar) root.findViewById(R.id.seekBar);
        mSeekBarViewModel = ViewModelProviders.of(getActivity()).get(SeekBarViewModel.class);
        subscribeSeekBar();
        return root;
    }

    private void subscribeSeekBar() {

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mSeekBarViewModel.seekbarValue.setValue(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        mSeekBarViewModel.seekbarValue.observe(
                (LifecycleOwner) getActivity(),
                new Observer<Integer>() {
                    @Override
                    public void onChanged(@Nullable Integer value) {
                        if (value != null) {
                            mSeekBar.setProgress(value);
                        }
                    }
                });
    }
}
