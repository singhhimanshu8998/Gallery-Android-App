package com.example.myapplication;

import android.net.Uri;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.myapplication.fragments.*;

public class MyPageAdapter extends FragmentStatePagerAdapter {

    private static final int no_of_pages = 8;
    Uri path;

    public MyPageAdapter(FragmentManager fm, Uri path) {
        super(fm);
        this.path = path;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment f = null;

        switch (i) {
            case 0:
                f = new Fragment1(path);
                break;
            case 1:
                f = new Fragment2(path);
                break;
            case 2:
                f = new Fragment3(path);
                break;
            case 3:
                f = new Fragment4(path);
                break;
            case 4:
                f = new Fragment5(path);
                break;
            case 5:
                f = new Fragment6(path);
                break;
            case 6:
                f = new Fragment7(path);
                break;
            case 7:
                f = new Fragment8(path);
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return no_of_pages;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(position+1);
    }
}