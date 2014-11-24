package com.comic_application;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView imgvTheLoai, imgvGioiThieu, imgvThongTin, imgvTuyChon;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imgvGioiThieu = (ImageView) findViewById(R.id.imgvGioiThieu);
		imgvTheLoai = (ImageView) findViewById(R.id.imgvTheLoai);
		imgvThongTin = (ImageView) findViewById(R.id.imgvThongTin);
		imgvTuyChon = (ImageView) findViewById(R.id.imgvTuyChon);
		
		imgvGioiThieu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent GioiThieu = new Intent(MainActivity.this,
						TruyenMaActivity.class);
				startActivity(GioiThieu);
			}
		});
		imgvTheLoai.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent TheLoai = new Intent (MainActivity.this, TruyenHaiActivity.class);
				startActivity(TheLoai);
			}
		});
		imgvThongTin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ThongTin = new Intent (MainActivity.this, TruyenKiemHiepActivity.class);
				startActivity(ThongTin);
			}
		});
		imgvTuyChon.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent TuyChon = new Intent (MainActivity.this, SachActivity.class);
				startActivity(TuyChon);
			}
		});
		
		
	}
}
