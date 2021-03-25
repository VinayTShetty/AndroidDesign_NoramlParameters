package com.normalDesign.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.normalDesign.Fragment.Fragment_Margin_Bottom_2;
import com.normalDesign.Fragment.Fragment_Margin_End_3;
import com.normalDesign.Fragment.Fragment_Margin_Left_5;
import com.normalDesign.Fragment.Fragment_Margin_Right_6;
import com.normalDesign.Fragment.Fragment_Margin_Top_8;
import com.normalDesign.Fragment.Fragment_layout_Margin_1;
import com.normalDesign.Fragment.Fragment_layout_Margin_Horizontal_4;
import com.normalDesign.Fragment.Fragment_layout_Margin_Start_7;
import com.normalDesign.Fragment.Fragment_layout_Margin_Vertical_9;

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
    public ScreenSlidePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fragment_layout_Margin_1();

            case 1:
                return new Fragment_Margin_Bottom_2();

            case 2:
                return new Fragment_Margin_End_3();

            case 3:
                return new Fragment_layout_Margin_Horizontal_4();

            case 4:
                return new Fragment_Margin_Left_5();

            case 5:
                return new Fragment_Margin_Right_6();

            case 6:
                return new Fragment_layout_Margin_Start_7();

            case 7:
                return new Fragment_Margin_Top_8();

            case 8:
                return new Fragment_layout_Margin_Vertical_9();


        }
        return null;
    }

    @Override
    public int getCount() {
        return 9;
    }
}
