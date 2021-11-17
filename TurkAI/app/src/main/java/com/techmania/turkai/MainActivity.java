package com.techmania.turkai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends FragmentActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private FragmentStateAdapter adapter;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        imageView = findViewById(R.id.imageView);

        adapter = new ScreenSlidePagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout,viewPager,((tab, position) -> {

            if (position == 0){
                tab.setText("United Kingdom");
            }else if (position == 1){
                tab.setText("USA");
            }else if (position == 2){
                tab.setText("Germany");
            }

        })).attach();

    }



    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0){
            super.onBackPressed();
        }else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }
}