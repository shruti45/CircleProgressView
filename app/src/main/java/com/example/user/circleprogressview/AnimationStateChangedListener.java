package com.example.user.circleprogressview;

/**
 * Created by user on 4/5/2016.
 */
public interface AnimationStateChangedListener{

    /**
     * Call if animation state changes.
     * This code runs in the animation loop, so keep your code short!
     * @param _animationState
     */
    void onAnimationStateChanged(AnimationState _animationState);
}