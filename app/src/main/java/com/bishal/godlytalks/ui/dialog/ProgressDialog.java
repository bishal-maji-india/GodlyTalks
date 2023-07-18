package com.bishal.godlytalks.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bishal.godlytalks.R;

public class ProgressDialog extends Dialog {
    private Context context;
    private TextView messageTV;
    public ProgressDialog(@NonNull Context context) {
        super(context);
        this.context=context;
        initialize();
    }

    private void initialize() {
        View view= LayoutInflater.from(context).inflate(R.layout.progress_dialog,null);
        setContentView(view);
        messageTV=view.findViewById(R.id.progress_dialog_message);
        setCancelable(false);
        setCanceledOnTouchOutside(false);

    }
    public void setProgressMessage(String message){
        if(messageTV!=null) {
            messageTV.setText(message);
        }
    }
}
