package com.geewaza.android.myweibo.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geewaza.android.myweibo.R;

/**
 * Created by wangh on 2016/4/30.
 */
public class TestActivity extends Activity {


	private Object[][] button_jump_map = {
			{R.id.test_button01, Test01Activity.class},
			{R.id.test_button02, Test02Activity.class},
			{R.id.test_button03, Test03Activity.class},
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_activity);
		addButtonIntent();
	}

	/**
	 * 通过数组的配置 给按钮安排跳转
	 */
	private void addButtonIntent() {
		for (final Object[] config : button_jump_map) {
			Button button = (Button) findViewById((Integer) config[0]);
			button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(TestActivity.this, (Class<?>) config[1]);
					startActivity(intent);
				}
			});
		}
	}
}
