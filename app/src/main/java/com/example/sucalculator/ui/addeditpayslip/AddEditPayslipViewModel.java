package com.example.sucalculator.ui.addeditpayslip;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddEditPayslipViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddEditPayslipViewModel() {
        mText = new MutableLiveData<>();
        // despite setting all the other TextView values in the code / from string.xml, I decided
        // to keep this piece of code here for the sake of example of how the template is working.
        mText.setValue("Add/edit a payslip");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
