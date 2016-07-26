package com.xinghai.sample;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.xinghai.imitation_ios.Drawables;
import com.xinghai.imitation_ios.svprogresshud.SVProgressHUD;

public class MainActivity extends AppCompatActivity {

    private Button btn,pvBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);

        pvBtn = (Button) findViewById(R.id.PvBtn);
    }

    public void toSVProgressHudDemo(View view){
        startActivity(new Intent(this,SVProgressHudDemoActivity.class));
    }

    public void toPickerViewDemo(View view){
        startActivity(new Intent(this,PickerViewActivity.class));
    }

}
