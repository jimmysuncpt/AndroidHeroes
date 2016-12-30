package com.jimmysun.androidheroes.chapter7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;

import com.jimmysun.androidheroes.R;

public class ObjectAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        Button translationButton = (Button) findViewById(R.id.btn_translation);
        if (translationButton != null) {
            translationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ObjectAnimator animator = ObjectAnimator.ofFloat(v, "translationX", 300);
                    animator.setDuration(300);
                    animator.start();
                }
            });
        }
        Button propertyValuesHolderButton = (Button) findViewById(R.id.btn_property_values_holder);
        if (propertyValuesHolderButton != null) {
            propertyValuesHolderButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PropertyValuesHolder propertyValuesHolder1 = PropertyValuesHolder.ofFloat
                            ("translationX", 300f);
                    PropertyValuesHolder propertyValuesHolder2 = PropertyValuesHolder.ofFloat
                            ("scaleX", 1f, 0, 1f);
                    PropertyValuesHolder propertyValuesHolder3 = PropertyValuesHolder.ofFloat
                            ("scaleY", 1f, 0, 1f);
                    ObjectAnimator.ofPropertyValuesHolder(v, propertyValuesHolder1,
                            propertyValuesHolder2, propertyValuesHolder3).setDuration(1000).start();
                }
            });
        }
        Button animatorSetButton = (Button) findViewById(R.id.btn_animator_set);
        if (animatorSetButton != null) {
            animatorSetButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ObjectAnimator animator1 = ObjectAnimator.ofFloat(v, "translationX", 300f);
                    ObjectAnimator animator2 = ObjectAnimator.ofFloat(v, "scaleX", 1f, 0f, 1f);
                    ObjectAnimator animator3 = ObjectAnimator.ofFloat(v, "scaleY", 1f, 0f, 1f);
                    AnimatorSet set = new AnimatorSet();
                    set.setDuration(1000);
//                    set.playTogether(animator1, animator2, animator3);
//                    set.playSequentially(animator1, animator2, animator3);
                    set.play(animator1).with(animator2).with(animator3);
                    set.start();
                }
            });
        }
        Button xmlButton = (Button) findViewById(R.id.btn_xml);
        if (xmlButton != null) {
            xmlButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Animator animator = AnimatorInflater.loadAnimator(ObjectAnimatorActivity.this, R
                            .animator.scalex);
                    animator.setTarget(v);
                    animator.start();
                }
            });
        }
        Button animateButton = (Button) findViewById(R.id.btn_animate);
        if (animateButton != null) {
            animateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.animate().alpha(0).y(300).setDuration(300);
                }
            });
        }

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_object_animator);
        // 设置过渡动画
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1);
        scaleAnimation.setDuration(2000);
        // 设置布局动画的显示属性
        LayoutAnimationController lac = new LayoutAnimationController(scaleAnimation, 0.5f);
        lac.setOrder(LayoutAnimationController.ORDER_RANDOM);
        // 为ViewGroup设置布局动画
        linearLayout.setLayoutAnimation(lac);
    }
}
