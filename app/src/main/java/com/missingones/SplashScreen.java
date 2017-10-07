package com.missingones;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashScreen extends ActionBarActivity {

	// Splash screen timer
	private static int SPLASH_TIME_OUT = 3000;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("yogi","yogi");
		setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        /*Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


               Intent i = new Intent(getApplicationContext(), MyActivity.class);
                startActivity(i);


            }
        });*/

		new Handler().postDelayed(new Runnable() {


			/* Showing splash screen with a timer. This will be useful when you
			 want to show case your app logo company*/


			@Override
			public void run() {
				// This method will be executed once the timer is over
				// Start your app main activity
                Toast.makeText(getApplicationContext(), "Check Internet Connection before Entering", Toast.LENGTH_LONG).show();
				Intent i = new Intent(SplashScreen.this, MyActivity.class);
				startActivity(i);
                finish();
				// close this activity

			}
		}, SPLASH_TIME_OUT);

	}

}
