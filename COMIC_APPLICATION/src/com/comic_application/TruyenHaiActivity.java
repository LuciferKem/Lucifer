package com.comic_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class TruyenHaiActivity extends Activity {
	ImageView imgvTruyen1, imgvTruyen2, imgvTruyen3, imgvTruyen4, imgvTruyen5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_truyen_co_tich);
		imgvTruyen1 = (ImageView) findViewById(R.id.imgvTruyen1);
		imgvTruyen2 = (ImageView) findViewById(R.id.imgvTruyen2);
		imgvTruyen3 = (ImageView) findViewById(R.id.imgvTruyen3);
		imgvTruyen4 = (ImageView) findViewById(R.id.imgvTruyen4);
		imgvTruyen5 = (ImageView) findViewById(R.id.imgvTruyen5);
		imgvTruyen1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Truyen1 = new Intent(TruyenHaiActivity.this,
						TruyenCoTich1Activity.class);
				startActivity(Truyen1);
			}
		});
		imgvTruyen1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Truyen1 = new Intent(TruyenHaiActivity.this,
						TruyenCoTich1Activity.class);
				startActivity(Truyen1);
			}
		});
		imgvTruyen2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Truyen2 = new Intent(TruyenHaiActivity.this,
						TruyenCoTich2Activity.class);
				startActivity(Truyen2);
			}
		});
		imgvTruyen3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Truyen3 = new Intent(TruyenHaiActivity.this,
						TruyenCoTich3Activity.class);
				startActivity(Truyen3);
			}
		});
		imgvTruyen4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Truyen4 = new Intent(TruyenHaiActivity.this,
						TruyenCoTich4Activity.class);
				startActivity(Truyen4);
			}
		});
		imgvTruyen5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Truyen5 = new Intent(TruyenHaiActivity.this,
						TruyenCoTich5Activity.class);
				startActivity(Truyen5);
			}
		});
	}
}
