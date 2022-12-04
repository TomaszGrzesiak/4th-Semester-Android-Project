package com.example.sucalculator.ui.basicdetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.sucalculator.R;
import com.example.sucalculator.databinding.FragmentBasicDetailsBinding;

public class BasicDetailsFragment extends Fragment {

    private FragmentBasicDetailsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BasicDetailsViewModel basicDetailsViewModel =
                new ViewModelProvider(this).get(BasicDetailsViewModel.class);

        binding = FragmentBasicDetailsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        NavController navController = Navigation.findNavController(container);
        binding.btnBack.setOnClickListener(v -> navController.navigate(R.id.action_nav_basic_details_to_nav_dashboard));
        binding.btnSave.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Data saved.", Toast.LENGTH_SHORT).show();
            navController.navigate(R.id.action_nav_basic_details_to_nav_dashboard);
        });

        final TextView textView = binding.textBasicDetails;
        basicDetailsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}