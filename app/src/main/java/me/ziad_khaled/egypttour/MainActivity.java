package me.ziad_khaled.egypttour;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.places_view);
        viewPager.setAdapter(new FragmentsAdapter(this, getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sections_tabs);
        tabLayout.setupWithViewPager(viewPager);

        DataStorage.init(getApplicationContext());
    }
}
