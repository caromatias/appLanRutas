package com.caromatias.lanappfidae;

import java.util.Timer;
import java.util.TimerTask;


import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SplashScreenActivity extends Activity {

	private long splashDelay = 3000; // 3 segundos
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		/*
		View decorView = getWindow().getDecorView();
		int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
		              | View.SYSTEM_UI_FLAG_FULLSCREEN;
		decorView.setSystemUiVisibility(uiOptions);
		*/
		
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				/*
				 * Intent mainIntent = new
				 * Intent().setClass(SplashScreenActivity.this,
				 * MainActivity.class); startActivity(mainIntent);
				 * overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
				 */
				Intent act = new Intent(SplashScreenActivity.this,	MainActivity.class);
				startActivity(act);
				overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
				//finish(); // Destruimos esta activity para prevenir que el
							// usuario retorne aqui presionando el boton Atras.
			}
		};

		Timer timer = new Timer();
		timer.schedule(task, splashDelay); // Pasado los 3 segundos dispara la
											// tarea
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}

}
