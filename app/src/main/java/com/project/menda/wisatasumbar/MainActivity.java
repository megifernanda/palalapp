package com.project.menda.wisatasumbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout;
    FancyButton btn_visit;

    Animation slideUp;
    Animation slideDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        layout = (RelativeLayout) findViewById(R.id.rl_login);
        btn_visit = (FancyButton) findViewById(R.id.btn_visit);

        btn_visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
                slideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);

                if (layout.getVisibility() != View.VISIBLE) {

                    layout.startAnimation(slideUp);
                    layout.setVisibility(View.VISIBLE);
                    btn_visit.setVisibility(View.GONE);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (layout.getVisibility() == View.VISIBLE) {

            layout.setVisibility(View.GONE);
            btn_visit.setVisibility(View.VISIBLE);
        }

    }
}