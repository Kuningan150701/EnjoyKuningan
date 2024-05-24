package com.example.enjoykuningan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

public class tab_layout extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        TabHost tabHost = getTabHost();
        this.setNewtab(this, tabHost, "tab1","Home", R.drawable.ic_launcher_background, new Intent(this, Home.class));
        this.setNewtab(this, tabHost, "tab2","About", R.drawable.ic_launcher_background, new Intent(this, About.class));


    }

    private void setNewtab(Context context, TabHost tabHost, String tag, String title, int icon, Intent intentid) {
        TabHost.TabSpec tabSpec = tabHost.newTabSpec(tag);
        tabSpec.setIndicator(title, context.getResources().getDrawable(icon));
        tabSpec.setContent(intentid);
        tabHost.addTab(tabSpec);
    }
}