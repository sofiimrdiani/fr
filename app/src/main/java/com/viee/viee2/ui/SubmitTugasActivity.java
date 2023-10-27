package com.viee.viee2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.viee.viee2.R;
import com.viee.viee2.databinding.ActivitySubmitTugasBinding;

public class SubmitTugasActivity extends AppCompatActivity {

    private ActivitySubmitTugasBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubmitTugasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}