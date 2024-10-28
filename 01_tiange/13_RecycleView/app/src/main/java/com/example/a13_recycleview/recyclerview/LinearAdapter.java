package com.example.a13_recycleview.recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {

    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(LinearAdapter.LinearViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
