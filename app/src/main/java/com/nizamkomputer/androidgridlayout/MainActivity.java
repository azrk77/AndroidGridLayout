package com.nizamkomputer.androidgridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ShareActionProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private class SessionHandler() {
        SharedPreferences sp;
        SessionHandler(SharedPreferences sp) {
            this.sp = sp;
        }
    }
}
