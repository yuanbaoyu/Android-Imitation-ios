package com.xinghai.sample;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import com.xinghai.imitation_ios.svprogresshud.SVProgressHUD;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSVProgressHudDemoActivity(View view){
        startActivity(new Intent(this,SVProgressHudDemoActivity.class));
    }

}
