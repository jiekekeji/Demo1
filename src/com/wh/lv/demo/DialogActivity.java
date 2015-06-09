package com.wh.lv.demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class DialogActivity extends Activity {

	private View pb;

	Handler mHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			pb.setVisibility(View.GONE);
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog);

		pb = (View) findViewById(R.id.pb);

		new Thread() {
			public void run() {
				try {
					Thread.sleep(3000);
					mHandler.sendEmptyMessage(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			};
		}.start();
		;
	}
}
