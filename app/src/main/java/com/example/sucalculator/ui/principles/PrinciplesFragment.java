package com.example.sucalculator.ui.principles;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.sucalculator.MainActivity;
import com.example.sucalculator.R;
import com.example.sucalculator.databinding.FragmentPrinciplesBinding;

public class PrinciplesFragment extends Fragment {

    private FragmentPrinciplesBinding binding;
    private Button btnBack;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        principlesViewModel principlesViewModel =
                new ViewModelProvider(this).get(principlesViewModel.class);
        NavController navController = Navigation.findNavController(container);

        binding = FragmentPrinciplesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnBack.setOnClickListener(v -> navController.navigate(R.id.action_nav_principles_to_nav_dashboard2));

        final TextView textView = binding.textPrinciples;
        principlesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}