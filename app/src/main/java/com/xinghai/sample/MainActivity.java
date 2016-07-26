package com.xinghai.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSVProgressHudDemo(View view){
        startActivity(new Intent(this,SVProgressHudDemoActivity.class));
    }

    public void toPickerViewDemo(View view){
        startActivity(new Intent(this,PickerViewActivity.class));
    }

    public void toAlertViewDemo(View view){
        startActivity(new Intent(this,AlertViewActivity.class));
    }

}
