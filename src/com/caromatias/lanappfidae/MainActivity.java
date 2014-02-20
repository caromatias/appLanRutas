package com.caromatias.lanappfidae;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*
		View decorView = getWindow().getDecorView();
		decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
		                              | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
		                              | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
		                              | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
		                              | View.SYSTEM_UI_FLAG_FULLSCREEN
		                              | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
		                              
		*/                              
		
		//final VideoView videoView = (VideoView) findViewById(R.id.video_principal);

		//Uri path = Uri.parse("android.resource://com.caromatias.lanAppFidae/"+ R.raw.bienvenidoariodejaneiro);

		//videoView.setVideoURI(path);
		//videoView.start();
		
		/*
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("android.resource://com.caromatias.lanappfidae/"+ R.raw.back_a_2_2));
		intent.setDataAndType(Uri.parse("android.resource://com.caromatias.lanAppFidae/"+ R.raw.back_a_2_2), "video/mp4");
		startActivity(intent);
		*/
		
		final VideoView videoView = 
	               (VideoView) findViewById(R.id.video_principal);
			
	           videoView.setVideoPath("android.resource://com.caromatias.lanappfidae/"+ R.raw.back_a_2_2);
	           Display display = getWindowManager().getDefaultDisplay(); 
               
               
	           
			videoView.start();
			
			
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
