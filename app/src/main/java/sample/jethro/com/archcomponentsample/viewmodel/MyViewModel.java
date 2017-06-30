package sample.jethro.com.archcomponentsample.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;

import sample.jethro.com.archcomponentsample.repository.PostalCodeRepository;

/**
 * Created by lin on 2017/6/27.
 */

public class MyViewModel extends ViewModel {

    private PostalCodeRepository repository = null;
    
    public MyViewModel(PostalCodeRepository repository) {
        this.repository = repository;
    }

    public LiveData<String> getPostalCode(String address) {
        return repository.getPostCode(address);
    }




    private final MutableLiveData<String> addressInput = new MutableLiveData();
    public final LiveData<String> postalCode =
            Transformations.switchMap(addressInput, (address) -> {
                return repository.getPostCode(address);
            });


    public void setInput(String address) {
        addressInput.setValue(address);
    }

}
