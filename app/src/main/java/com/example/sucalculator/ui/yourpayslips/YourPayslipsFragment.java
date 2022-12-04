package com.example.sucalculator.ui.yourpayslips;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sucalculator.R;
import com.example.sucalculator.databinding.FragmentYourPayslipsBinding;


public class YourPayslipsFragment extends Fragment {

    private FragmentYourPayslipsBinding binding;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        YourPayslipsViewModel YourPayslipsViewModel =
                new ViewModelProvider(this).get(YourPayslipsViewModel.class);

        binding = FragmentYourPayslipsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        NavController navController = Navigation.findNavController(container);
        binding.btnBack.setOnClickListener(v -> navController.navigate(R.id.action_nav_your_payslips_to_nav_dashboard));
        binding.btnAddAPayslip.setOnClickListener(v -> {
            navController.navigate(R.id.action_nav_your_payslips_to_nav_add_edit_payslip);
        });

        final TextView textView = binding.textYourPayslips;
        YourPayslipsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}