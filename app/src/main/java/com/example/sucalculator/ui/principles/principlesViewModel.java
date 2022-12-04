package com.example.sucalculator.ui.principles;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class principlesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public principlesViewModel() {
        mText = new MutableLiveData<>();
        // despite setting all the other TextView values in the code / from string.xml, I decided
        // to keep this piece of code here for the sake of example of how the template is working.
        mText.setValue("SU Calculator");
    }

    public LiveData<String> getText() {
        return mText;
    }
}