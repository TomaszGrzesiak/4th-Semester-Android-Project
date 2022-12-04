package com.example.sucalculator.ui.dashboard;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.sucalculator.R;
import com.example.sucalculator.databinding.FragmentDashboardBinding;
import com.google.android.material.navigation.NavigationView;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(dashboardViewModel.class);
        NavController navController = Navigation.findNavController(container);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnPrinciplesAndFormulas.setOnClickListener(v -> navController.navigate(R.id.action_nav_dashboard_to_nav_principles));
        binding.btnYourBasicDetails.setOnClickListener(v -> navController.navigate(R.id.action_nav_dashboard_to_nav_basic_details));
        binding.btnAddAPayslip.setOnClickListener(v -> navController.navigate(R.id.action_nav_dashboard_to_nav_add_edit_payslip));
        binding.btnCalculationsSummary.setOnClickListener(v -> navController.navigate(R.id.action_nav_dashboard_to_nav_calculations_summary));

        final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}