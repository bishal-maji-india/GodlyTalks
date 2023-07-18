package com.bishal.godlytalks.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.bishal.godlytalks.R;
import com.bishal.godlytalks.databinding.ActivityOtpBinding;

public class Otp extends AppCompatActivity {
    ActivityOtpBinding binding;
    int otpFillCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        binding = ActivityOtpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setupFocusChanger(binding.otpEt1);
        setupFocusChanger(binding.otpEt2);
        setupFocusChanger(binding.otpEt3);
        setupFocusChanger(binding.otpEt4);
        setupFocusChanger(binding.otpEt5);
        setupFocusChanger(binding.otpEt6);
    }

    private void setupFocusChanger(EditText otpEt) {
        otpEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (otpEt == binding.otpEt1) {
                    binding.otpEt2.requestFocus();
                }
                if (otpEt == binding.otpEt2) {
                    binding.otpEt3.requestFocus();
                }
                if (otpEt == binding.otpEt3) {
                    binding.otpEt4.requestFocus();
                }
                if (otpEt == binding.otpEt4) {
                    binding.otpEt5.requestFocus();
                }
                if (otpEt == binding.otpEt5) {
                    binding.otpEt6.requestFocus();
                }
                if (otpEt == binding.otpEt6) {
                    if (!binding.otpVerifyBtn.isEnabled()) {
                        binding.otpVerifyBtn.setEnabled(true);
                    }
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean isEmptyBox=s.toString().trim().isEmpty();
                if(!isEmptyBox){
                    otpFillCount++;
                }else{
                    otpFillCount--;
                }
                binding.otpVerifyBtn.setEnabled(otpFillCount == 6);


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}