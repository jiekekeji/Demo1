package com.wh.ab;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.wh.lv.demo.R;

public class ActionBarDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ab_action);

		onAddTab();
	}

	public void onAddTab() {
		final ActionBar bar = getActionBar();

		bar.addTab(bar
				.newTab()
				.setText(4)
				.setTabListener(
						new TabListener(new TabContentFragment("fragment"))));
	}

	private class TabListener implements ActionBar.TabListener {
		private TabContentFragment mFragment;

		public TabListener(TabContentFragment fragment) {
			mFragment = fragment;
		}

		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			ft.add(R.id.fragment_content, mFragment, mFragment.getText());
		}

		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			ft.remove(mFragment);
		}

		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			Toast.makeText(ActionBarDemo.this, "Reselected!",
					Toast.LENGTH_SHORT).show();
		}

	}

	private class TabContentFragment extends Fragment {
		private String mText;

		public TabContentFragment(String text) {
			mText = text;
		}

		public String getText() {
			return mText;
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View fragView = inflater.inflate(R.layout.action_bar_tab_content,
					container, false);

			TextView text = (TextView) fragView.findViewById(R.id.text);
			text.setText(mText);

			return fragView;
		}

	}
}
