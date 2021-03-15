package com.normalDesign.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.normalDesign.Fragment.Fragment_Margin_Bottom;
import com.normalDesign.Fragment.Fragment_Margin_Left;
import com.normalDesign.Fragment.Fragment_Margin_Right;
import com.normalDesign.Fragment.Fragment_Margin_Top;
import com.normalDesign.Fragment.Fragment_layout_Margin;

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    public ScreenSlidePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment_layout_Margin();

            case 1:
                return new Fragment_Margin_Right();

            case 2:
                return new Fragment_Margin_Left();
            case 3:
                return new Fragment_Margin_Bottom();
            case 4:
                return new Fragment_Margin_Top();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
