package com.android.front_vs_back;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView imageResult = (ImageView) findViewById(R.id.imageResult);
        ImageView imageResultText = (ImageView) findViewById(R.id.imageResultText);
        Button btnBack = (Button) findViewById(R.id.btnBack);

        // front - back >=  5 = front 9 4
        // front - back <= -5 = back  4 9
        // -5< front - back < 5 = full -4 ~ 4 / 5, 8 / 6, 7 / 7, 6 / 8, 5 /
        Count count = (Count) getApplication();

        /**
         *  Front, Back 결과 내용 출력
         *  아직 미구현이므로 임시 주석
         */

//        if(count.getFront() - count.getBack() >= 5) {
//            imageResult.setImageResource();
//            imageResultText.setImageResource();
//        }
//        else if(count.getFront() - count.getBack() <= 5) {
//            imageResult.setImageResource();
//            imageResultText.setImageResource();
//        }
//        else {
//            imageResult.setImageResource();
//            imageResultText.setImageResource();
//        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                // finish() ?
                // startActivity() ?
            }
        });

    }



}
