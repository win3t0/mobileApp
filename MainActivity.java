package com.example.galleryapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    String[] titles = {
            "시스템 분석 및 설계 프로젝트",
            "04/07 자료구조 수업 코드",
            "백엔드 프로그래밍 수업 코드"
    };

    int[] images = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new GalleryAdapter(titles, images));
    }
}
