package com.bishal.godlytalks.util.handler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class DelayStartActivity {
    public static void delayedStart(final Context context, long delayTime, final Class<?> activity,boolean tobeFinished) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity here
                Intent intent = new Intent(context, activity);
                context.startActivity(intent);
                if(tobeFinished){
                if (context instanceof Activity){
                    ((Activity) context).finish();
                }
            }}
        }, delayTime);
    }
}
