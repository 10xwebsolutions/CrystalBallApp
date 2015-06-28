package com.example.crystalballapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	SharedPreferences pref;
	SharedPreferences.Editor editorPref;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pref=getApplicationContext().getSharedPreferences("SettingsFile", MODE_WORLD_WRITEABLE);
		if(pref.getBoolean("Remember", false))
		{
		NextFunction(null);
		finish();
		}
	}
public void Remember(View a)
{
	
	editorPref=pref.edit();
	editorPref.putBoolean("Remember", true);
	editorPref.commit();
}
	public void NextFunction(View abc)
	{
		Intent myIntent= new Intent(getApplicationContext(),SecondActivity.class);
		startActivity(myIntent);
	}

}
