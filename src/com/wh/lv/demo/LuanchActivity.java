package com.wh.lv.demo;

import com.wh.ab.ActionBarDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class LuanchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_luanch);
	}

	public void open1(View view) {
		startActivity(new Intent(this, MainActivity.class));
	}

	public void open2(View view) {
		startActivity(new Intent(this, MulListViewActivity.class));
	}

	public void open3(View view) {
		startActivity(new Intent(this, RadioButtonActivity.class));
	}

	public void open4(View view) {
		startActivity(new Intent(this, DialogActivity.class));
	}

	public void open5(View view) {
		startActivity(new Intent(this, ActionBarDemo.class));
	}

}
