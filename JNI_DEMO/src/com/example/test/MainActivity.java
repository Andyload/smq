package com.example.test;

import com.example.test.util.NativeUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button bu1, bu2;


	int i = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		bu1 = (Button)findViewById(R.id.button1);
		bu1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		String say = NativeUtils.hello();
		Toast.makeText(this, say, Toast.LENGTH_SHORT).show();

	}

}
