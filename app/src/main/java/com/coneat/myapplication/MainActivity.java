package com.coneat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();

    Button bt_setAlarm_oneMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();
    }

    private void initializeView() {
        bt_setAlarm_oneMinute = findViewById(R.id.bt_setAlarm_oneMinute);
    }

    /**
     * 알람 등록
     */
    public void setAlarm() {

    }

}
