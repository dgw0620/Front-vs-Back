package com.android.front_vs_back;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_twelve extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);


        RadioGroup radioG1 = (RadioGroup) findViewById(R.id.radioG1);
        RadioButton radioBtn1 = (RadioButton) findViewById(R.id.radioBtn1);
        RadioButton radioBtn2 = (RadioButton) findViewById(R.id.radioBtn2);
        Button btnNext = (Button) findViewById(R.id.btnNext);


//        radioG1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
//                RadioButton btn = radioGroup.findViewById(checkId);
//                Count count = (Count) getApplication();
//
//                switch(checkId) {
//                    case R.id.radioBtn1:
//                        count.setFront(count.getFront()+1);
//                        Toast.makeText(getApplicationContext(),"1번 "+count.getFront(),Toast.LENGTH_SHORT).show();
//
//                        break;
//                    case R.id.radioBtn2:
//                        count.setBack(count.getBack()+1);
//                        Toast.makeText(getApplicationContext(),"2번 "+count.getBack(),Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Count count = (Count) getApplication();
                Intent intent = new Intent(getApplicationContext(),Activity_thirteen.class);

                if(radioBtn1.isChecked() == false && radioBtn2.isChecked() == false) {
                    Toast.makeText(getApplicationContext(),"항목을 선택해주세요",Toast.LENGTH_SHORT).show();
                }
                else if(radioBtn1.isChecked()){
                    count.setFront(count.getFront()+1);
                    Toast.makeText(getApplicationContext(),"1번 "+count.getFront(),Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                else if(radioBtn2.isChecked()){
                    count.setBack(count.getBack()+1);
                    Toast.makeText(getApplicationContext(),"2번 "+count.getBack(),Toast.LENGTH_SHORT).show();
                    startActivity(intent);

                }
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
