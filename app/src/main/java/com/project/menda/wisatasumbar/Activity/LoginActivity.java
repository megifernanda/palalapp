package com.project.menda.wisatasumbar.Activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.project.menda.wisatasumbar.Builder.BlurBuilder;
import com.project.menda.wisatasumbar.R;


/**
 * Created by Menda on 9/8/17.
 */

public class LoginActivity extends AppCompatActivity {

    ImageView iv_background;
    Context context;
    Bitmap bitmap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);


    }
}
