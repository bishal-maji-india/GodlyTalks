package com.bishal.godlytalks.util.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

import com.bishal.godlytalks.util.Calculator;

public class CustomAnimation {
    public void startRotateAnimation(View view){
        RotateAnimation rotateAnimation=new RotateAnimation(0,-360, Animation.RELATIVE_TO_SELF,0.5f
        ,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(30000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);

    }
}
