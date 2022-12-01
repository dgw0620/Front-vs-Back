package com.android.front_vs_back;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ResultLoadingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultloading);

        ImageView loading_gif = (ImageView) findViewById(R.id.loading_gif);
        Glide.with(this).load(R.drawable.progress_bar).into(loading_gif);

        startLoading();
    }

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), ResultActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2700);
    }
}