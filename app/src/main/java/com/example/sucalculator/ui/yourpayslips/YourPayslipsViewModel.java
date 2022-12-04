package com.example.sucalculator.ui.yourpayslips;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.sucalculator.businesslogic.Payslip;

public class YourPayslipsViewModel extends ViewModel {

    private MutableLiveData<Payslip> payslip;

    private final MutableLiveData<String> mText;

    public YourPayslipsViewModel() {
        mText = new MutableLiveData<>();
        // despite setting all the other TextView values in the code / from string.xml, I decided
        // to keep this piece of code here for the sake of example of how the template is working.
        mText.setValue("Your payslips");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
