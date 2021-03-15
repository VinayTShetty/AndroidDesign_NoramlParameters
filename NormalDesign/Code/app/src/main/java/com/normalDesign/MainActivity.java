package com.normalDesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.normalDesign.Adapter.ScreenSlidePagerAdapter;

import static androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class MainActivity extends AppCompatActivity {
    private ViewPager mPager;
    private ScreenSlidePagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeViews();
        intializePagerAdapter();
    }
    private void intializeViews(){
        mPager=(ViewPager)findViewById(R.id.main_activity_viewPager);
    }
    private void intializePagerAdapter(){
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager(),BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mPager.setAdapter(pagerAdapter);
    }
}