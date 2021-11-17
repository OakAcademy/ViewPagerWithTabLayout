package com.techmania.turkai;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ScreenSlidePagerAdapter extends FragmentStateAdapter {

    public ScreenSlidePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position",position+1);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
