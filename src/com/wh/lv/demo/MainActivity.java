package com.wh.lv.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.wh.lv.demo.adapter.MyAdapter;

public class MainActivity extends Activity {

	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initHeaderAndFooter();

		initListView();

	}

	private void initHeaderAndFooter() {
		listView = (ListView) findViewById(R.id.listview);
		LayoutInflater inflater = LayoutInflater.from(this);

		View headerView = inflater.inflate(R.layout.item_lv_header, null);
		
		
		
		View footerView = inflater.inflate(R.layout.item_lv_footer, null);

		listView.addHeaderView(headerView);
		listView.addFooterView(footerView);

	}

	private void initListView() {
		listView.setAdapter(new MyAdapter(this));
	}
}
