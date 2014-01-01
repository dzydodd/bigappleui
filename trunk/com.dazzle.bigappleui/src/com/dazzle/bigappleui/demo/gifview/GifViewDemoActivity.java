package com.dazzle.bigappleui.demo.gifview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.dazzle.bigappleui.R;
import com.dazzle.bigappleui.gifview.GifView;

/**
 * 显示gifview控件demo
 * 
 * @author xuan
 */
public class GifViewDemoActivity extends Activity {
	private boolean pause = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo_gifview_main);

		final GifView gif = (GifView) findViewById(R.id.gif);
		gif.setGifImage(R.drawable.demo_gifview_pic);

		final Button button = (Button) findViewById(R.id.button);
		button.setText("点击暂停");
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				if (pause) {
					gif.showAnimation();
					pause = false;
					button.setText("点击暂定");
				} else {
					gif.showCover();
					pause = true;
					button.setText("点击继续");
				}
			}
		});
	}
}