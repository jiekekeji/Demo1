package com.wh.demo.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

@SuppressLint("NewApi")
public class MyRadioButton extends RadioButton {

	public MyRadioButton(Context context, AttributeSet attrs, int defStyleAttr,
			int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	public MyRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public MyRadioButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyRadioButton(Context context) {
		super(context);
	}

}
