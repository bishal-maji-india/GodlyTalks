package com.bishal.godlytalks.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.bishal.godlytalks.databinding.ActivityLoginBinding;
import com.bishal.godlytalks.ui.dialog.ProgressDialog;

import com.bishal.godlytalks.util.animation.CustomAnimation;


public class Login extends AppCompatActivity {
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding=ActivityLoginBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        progressDialog=new ProgressDialog(this);
        progressDialog.setProgressMessage("Please wait..");
        //start image rotation
        new CustomAnimation().startRotateAnimation(binding.loginIconBg);
        //
        TextWatcher textWatcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int length=s.length();
                binding.loginBtn.setEnabled(length>=10);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        binding.loginPhoneNo.addTextChangedListener(textWatcher);
        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
                binding.loginBtn.setEnabled(false);
                //hide progress after work
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressDialog.dismiss();
                        startActivity(new Intent(Login.this,Otp.class));
                    }
                },3000);
            }
        });
    }

}