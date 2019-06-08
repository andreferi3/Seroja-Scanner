package cde.android.qrscanner.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.OnClick;
import cde.android.qrscanner.R;

/**
 * Created by andre on 06-May-19.
 */

public class AboutSerojaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_seroja);
    }


    public void backButton(View view) {
        finish();
    }
}
