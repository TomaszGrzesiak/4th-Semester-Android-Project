package com.example.sucalculator.ui.calculationssummary;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sucalculator.R;
import com.example.sucalculator.databinding.FragmentCalculationsSummaryBinding;

public class CalculationsSummaryFragment extends Fragment {

    private FragmentCalculationsSummaryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CalculationsSummaryViewModel CalculationsSummaryViewModel =
                new ViewModelProvider(this).get(CalculationsSummaryViewModel.class);

        binding = FragmentCalculationsSummaryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        NavController navController = Navigation.findNavController(container);
        binding.btnBack.setOnClickListener(v -> navController.navigate(R.id.action_nav_calculations_summary_to_nav_dashboard));

        final TextView textView = binding.textCalculationsSummary;
        CalculationsSummaryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}