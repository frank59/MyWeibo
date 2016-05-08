package com.geewaza.android.myweibo.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.geewaza.android.myweibo.R;

/**
 * Created by wangh on 2016/5/8.
 */
public class Test03Activity extends Activity {

	private static final String[] suggest_string = {
			"beijing01",
			"beijing02",
			"beijing03",
			"beijing04",
			"beijing05",
			"shanghai01",
			"shanghai02",
			"shanghai03",
			"shanghai04",
			"shanghai05",
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test03_activity);

		AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.test03_actextview);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, suggest_string);
		acTextView.setAdapter(adapter);

		MultiAutoCompleteTextView macTextView = (MultiAutoCompleteTextView) findViewById(R.id.test03_mactextview);
		macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		macTextView.setAdapter(adapter);

	}
}
