package com.example.firebasedatabinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebasedatabinding.databinding.UserListBinding;

import java.util.ArrayList;

public class MyCostumAdapter extends RecyclerView.Adapter<MyCostumAdapter.UserViewHolder> {
    Context context;
    ArrayList<User> userArrayList;

    public MyCostumAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public MyCostumAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        UserListBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.user_list,parent,false);

        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCostumAdapter.UserViewHolder holder, int position) {
        User user = userArrayList.get(position);
        holder.userListBinding.setUser(user);

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        private UserListBinding userListBinding;
        public UserViewHolder(UserListBinding userListBinding) {
            super(userListBinding.getRoot());
            this.userListBinding = userListBinding;

            userListBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position = getAdapterPosition();
                }
            });

        }


    }

}
