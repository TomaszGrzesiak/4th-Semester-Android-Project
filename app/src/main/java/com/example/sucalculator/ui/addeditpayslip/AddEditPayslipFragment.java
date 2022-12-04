package com.example.sucalculator.ui.addeditpayslip;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sucalculator.R;
import com.example.sucalculator.databinding.FragmentAddEditPayslipBinding;


public class AddEditPayslipFragment extends Fragment {

    private FragmentAddEditPayslipBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddEditPayslipViewModel AddEditPayslipViewModel =
                new ViewModelProvider(this).get(AddEditPayslipViewModel.class);

        binding = FragmentAddEditPayslipBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        NavController navController = Navigation.findNavController(container);
        binding.btnBack.setOnClickListener(v -> navController.popBackStack());
        binding.btnSave.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Data saved.", Toast.LENGTH_SHORT).show();
            navController.popBackStack();
        });

        final TextView textView = binding.textAddEditPayslip;
        AddEditPayslipViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);








        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}