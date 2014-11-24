package com.comic_application;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomeActivity extends Activity {
	ImageView imgvClickToRead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imgvClickToRead = (ImageView)findViewById(R.id.imgvClickToRead);
        imgvClickToRead.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ClickToRead = new Intent (HomeActivity.this, MainActivity.class);
				startActivity(ClickToRead);
			}
		});
    }
}
