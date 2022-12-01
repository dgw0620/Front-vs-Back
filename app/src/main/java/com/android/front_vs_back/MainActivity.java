package com.android.front_vs_back;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button startBtn = (Button) findViewById(R.id.startBtn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_one.class);
                startActivity(intent);
            }
        });
    }

    private long time = 0;
    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis() > time + 2000) {
            time = System.currentTimeMillis();
            Toast.makeText(getApplicationContext(),"\'뒤로\' 버튼을 한번 더 누르시면 종료됩니다.",Toast.LENGTH_SHORT).show();
            return;
        }

        if(System.currentTimeMillis() <= time + 2000) {
            finishAffinity();
        }
    }
}