package com.lopparg.lopparg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	/** Starte das Spiel */
    public void startGame(View view) {
    	Intent intent = new Intent(this, Game.class);
    	startActivity(intent);
    }
    
    /** Setze die Schwierigkeit */
    public void schwierigkeitEinstellen(View view) {
    	Intent intent = new Intent(this, Schwierigkeit.class);
    	startActivity(intent);
    }
    
    /** Zeige das Highscore */
    public void highscore(View view) {
    	Intent intent = new Intent(this, Highscore.class);
    	startActivity(intent);
    }
    
    
    
    

}
