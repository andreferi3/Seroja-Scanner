package cde.android.qrscanner.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cde.android.qrscanner.R;

public class LaunchScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        int secondsDelayed = 3;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(LaunchScreenActivity.this, HomeActivity.class));
                finish();
            }
        }, secondsDelayed * 1000);

    }
}
