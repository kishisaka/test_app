package com.pinger.testapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder>{
    private List<Name> names;

    public NameAdapter(List<Name> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.name, viewGroup, false);
        return new NameViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder nameViewHolder, int i) {
        nameViewHolder.name.setText(names.get(i).name);
        nameViewHolder.number.setText(names.get(i).phoneNumber);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class NameViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView number;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.name_field);
            this.number = itemView.findViewById(R.id.number_field);
        }
    }
}
