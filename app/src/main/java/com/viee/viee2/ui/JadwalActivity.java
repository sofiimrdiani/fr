package com.viee.viee2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.viee.viee2.R;
import com.viee.viee2.databinding.ActivityJadwalBinding;

public class JadwalActivity extends AppCompatActivity {

    private ActivityJadwalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJadwalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}