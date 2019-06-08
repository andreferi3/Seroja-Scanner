package cde.android.qrscanner.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cde.android.qrscanner.R;

/**
 * Created by andre on 06-May-19.
 */

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void scanSekarang(View view) {
        Intent scanNow = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(scanNow);
    }

    public void tentangCDE(View view) {
        Intent aboutMaker = new Intent(HomeActivity.this, AboutMakerActivity.class);
        startActivity(aboutMaker);
    }

    public void tentangSeroja(View view) {
        Intent aboutSeroja = new Intent(HomeActivity.this, AboutSerojaActivity.class);
        startActivity(aboutSeroja);
    }
}
