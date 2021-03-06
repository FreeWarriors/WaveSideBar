package com.freedom.albert.wavesidebar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.freedom.albert.wavesidebarlib.SideBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SideBar sideBar = (SideBar) findViewById(R.id.wave_sidebar);
        final TextView selected = (TextView) findViewById(R.id.selected);
        sideBar.setOnTouchingLetterChangedListener(new SideBar.OnTouchingLetterChangedListener() {
            @Override
            public void onTouchingLetterChanged(String s) {
                selected.setText(s);
            }
        });
    }
}
