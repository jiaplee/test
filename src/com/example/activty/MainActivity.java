package com.example.activty;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("MainActivitya :onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("MainActivitya :onStart");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("MainActivitya onResume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("MainActivitya onPause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("MainActivitya onStop");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("MainActivitya onRestart");
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		System.out.println("MainActivitya onSaveInstanceState");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("MainActivitya onDestroy");
	}
	
	
	 
}
