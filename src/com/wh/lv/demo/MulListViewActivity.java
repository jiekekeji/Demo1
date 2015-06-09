package com.wh.lv.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.wh.lv.demo.adapter.MulAdapter;

public class MulListViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mul_list);

		ListView listview = (ListView) findViewById(R.id.listview);
		listview.setAdapter(new MulAdapter(this));
	}

}
