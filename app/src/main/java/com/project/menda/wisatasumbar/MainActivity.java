package com.project.menda.wisatasumbar;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.common.SignInButton;
import com.project.menda.wisatasumbar.Activity.HomeActivity;

import io.fabric.sdk.android.Fabric;
import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private SignInButton btn_visit;
    private FancyButton btn_login;
    private TextView tv_register;
    private EditText et_nama;
    private EditText et_email;
    private EditText et_password;

    private Animation slideUp;
    private Animation slideDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.login_layout);

        layout = (RelativeLayout) findViewById(R.id.rl_login);
        btn_visit = (SignInButton) findViewById(R.id.btn_visit);
        btn_login = (FancyButton) findViewById(R.id.btn_login);
//        tv_register = (TextView) findViewById(R.id.tv_register);

        btn_visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
//
//        btn_visit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
//                slideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
//
//                if (layout.getVisibility() != View.VISIBLE) {
//
//                    layout.startAnimation(slideUp);
//                    layout.setVisibility(View.VISIBLE);
//                    btn_visit.setVisibility(View.GONE);
//                }
//            }
//        });

//        btn_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                startActivity(intent);
//            }
//        });

//        tv_register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                layout.setVisibility(View.GONE);
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
//                View mView = getLayoutInflater().inflate(R.layout.register_dialog_layout, null);
//
//                et_nama = (EditText) mView.findViewById(R.id.et_nama);
//                et_email = (EditText) mView.findViewById(R.id.et_email);
//                et_password = (EditText) mView.findViewById(R.id.et_password);
//
//                mBuilder.setView(mView);
//                final AlertDialog dialog = mBuilder.create();
//                dialog.show();
//
//            }
//        });

    }

//    @Override
//    public void onBackPressed() {
//
//        if (layout.getVisibility() == View.GONE) {
//            layout.setVisibility(View.VISIBLE);
//        } else if (layout.getVisibility() == View.VISIBLE) {
//
//            layout.setVisibility(View.GONE);
//            btn_visit.setVisibility(View.VISIBLE);
//        }
//
//    }

//    public void forceCrash(View view) {
//        throw new RuntimeException("This is a crash");
//    }

}