package com.coneat.myapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    private final String INTENT_ACTION = "com.coneat.myapplication";

    Button bt_setAlarm_oneMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();
    }

    private void initializeView() {
        bt_setAlarm_oneMinute = findViewById(R.id.bt_setAlarm_oneMinute);

        bt_setAlarm_oneMinute.setOnClickListener(v -> setAlarm(getApplicationContext(), 30000));
    }

    /**
     * 알람 등록
     */
    private void setAlarm(Context context, long time) {
        Log.d(TAG, "setAlarm");
        AlarmManager manager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(this, AlarmBroadcastReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);

        manager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + time, pendingIntent);
    }

}
