package com.example.sucalculator.ui.payslipsrecycleview;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sucalculator.R;
import com.example.sucalculator.businesslogic.Payslip;
import com.example.sucalculator.ui.placeholder.PlaceholderContent;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class PayslipFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PayslipFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static PayslipFragment newInstance(int columnCount) {
        PayslipFragment fragment = new PayslipFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_payslip_recycleview_list_layout, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            List<Payslip> payslipList = new ArrayList<>();
            payslipList = populatePayslipListWithDummyData();
            recyclerView.setAdapter(new MyPayslipRecyclerViewAdapter(payslipList));
            recyclerView.hasFixedSize();
        }
        return view;
    }

    private List<Payslip> populatePayslipListWithDummyData() {
        List<Payslip> payslipList = new ArrayList<>();
        payslipList.add(new Payslip(123.11,11,11,11,"notes1"));
        payslipList.add(new Payslip(2.2,2,2,2,"notes2"));
        payslipList.add(new Payslip(3,3,3,3,"notes3"));
        payslipList.add(new Payslip(4,4,4,4,"notes4"));
        payslipList.add(new Payslip(5,5,5,5,"notes5"));
        payslipList.add(new Payslip(6,6,6,6,"notes6"));
        payslipList.add(new Payslip(7,7,7,7,"notes7"));
        payslipList.add(new Payslip(8,8,8,8,"notes8"));
        payslipList.add(new Payslip(9,9,9,9,"notes9"));




        return payslipList;
    }
}