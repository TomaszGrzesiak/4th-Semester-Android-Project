package com.example.sucalculator.ui.payslipsrecycleview;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sucalculator.businesslogic.Payslip;
import com.example.sucalculator.ui.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.sucalculator.databinding.FragmentPayslipRecycleviewObjectContentBinding;


import org.w3c.dom.Text;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyPayslipRecyclerViewAdapter extends RecyclerView.Adapter<MyPayslipRecyclerViewAdapter.ViewHolder> {

    private List<Payslip> payslipList;

    public MyPayslipRecyclerViewAdapter(List<Payslip> payslipList) {
        this.payslipList = payslipList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(FragmentPayslipRecycleviewObjectContentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.note.setText(payslipList.get(position).getNotes());
        holder.weekNo.setText(payslipList.get(position).getWeekNumber());
        holder.income.setText(payslipList.get(position).getTaxedIncome()+"");
    }

    @Override
    public int getItemCount() {
        return payslipList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView income;
        public TextView weekNo;
        public TextView note;

        public ViewHolder(FragmentPayslipRecycleviewObjectContentBinding binding) {
            super(binding.getRoot());
            income = binding.textViewIncome;
            weekNo = binding.textViewWeekNo;
            note = binding.textViewNote;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + note.getText() + "'";
        }
    }
}