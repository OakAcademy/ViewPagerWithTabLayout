package com.techmania.turkai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ScreenSlidePageFragment extends Fragment {

    ImageView imageView;
    TextView textView;

    public ScreenSlidePageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
        imageView = view.findViewById(R.id.imageView);
        textView = view.findViewById(R.id.textView);

        Bundle bundle = getArguments();

        if (bundle != null){
            int position = bundle.getInt("position",0);
            if (position == 0){
                imageView.setImageResource(R.drawable.unitedkingdom);
                textView.setText(R.string.uk);
            }else if (position == 1){
                imageView.setImageResource(R.drawable.usa);
                textView.setText(R.string.usa);
            }else if (position == 2){
                imageView.setImageResource(R.drawable.germany);
                textView.setText(R.string.germany);
            }
        }

        // Inflate the layout for this fragment
        return view;
    }
}