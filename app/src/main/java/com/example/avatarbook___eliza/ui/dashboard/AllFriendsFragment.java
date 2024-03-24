package com.example.avatarbook___eliza.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.avatarbook___eliza.databinding.FragmentAllFriendsBinding;
import com.example.avatarbook___eliza.room.AppDataBase;

public class AllFriendsFragment extends Fragment {

    private com.example.avatarbook___eliza.databinding.FragmentAllFriendsBinding binding;

    private AppDataBase appDataBase;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = com.example.avatarbook___eliza.databinding.FragmentAllFriendsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();




        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}