package com.example.crystalballapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	public void ProceedFunction(View abc)
	{
		Intent myIntent= new Intent(getApplicationContext(),ResultActivity.class);
		startActivity(myIntent);
	}
}
