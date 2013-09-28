package com.dazzle.bigappleui;

import android.app.Activity;
import android.os.Bundle;

import com.dazzle.bigappleui.view.RoundedImageView;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        RoundedImageView roundedImageView = (RoundedImageView) findViewById(R.id.roundedImageView);

        // roundedImageView.setRoundPx(500f);// 自定义设置roundPx，默认值20
        roundedImageView.setImageResource(R.drawable.pic1);
    }
}
