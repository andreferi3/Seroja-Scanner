package cde.android.qrscanner.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import butterknife.OnClick;
import cde.android.qrscanner.R;

/**
 * Created by andre on 06-May-19.
 */

public class AboutMakerActivity extends AppCompatActivity {

    WebView wvKu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_maker);

        wvKu = (WebView) findViewById(R.id.wv_aboutMaker);
        WebSettings webSettings = wvKu.getSettings();

        webSettings.setAllowContentAccess(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setLoadsImagesAutomatically(true);

        webSettings.setJavaScriptEnabled(true);

        wvKu.getSettings().setLoadsImagesAutomatically(true);
        wvKu.getSettings().setDomStorageEnabled(true);

        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        wvKu.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvKu.setWebChromeClient(new WebChromeClient());

        wvKu.loadUrl("file:///android_asset/about.html");
    }
    @Override
    public void onBackPressed(){

        if (wvKu.canGoBack()){
            wvKu.goBack();
        }else {
            finish();
        }
    }

    public void backButton(View view) {
        finish();
    }
}
