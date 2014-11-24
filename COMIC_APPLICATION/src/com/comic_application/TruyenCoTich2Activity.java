package com.comic_application;

import java.io.InputStream;
import java.util.ArrayList;
 
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
 
import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
 
public class TruyenCoTich2Activity extends Activity 
{
 
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truyen_co_tich_2);
        //Thực hiện hàm phân tích XML
        parseXML();
    }
    //Hàm phân tích XML
    private void parseXML()
    {
        // Đối tượng quản lý thư mục asset trong một ứng dụng Android
        AssetManager assetManager = getBaseContext().getAssets();
        try {
            //Lấy 1 tập tin làm dữ liệu đầu vào có tên là "order.xml"
            InputStream is = assetManager.open("sutichhobabe.xml");
            //Tạo đối tượng dùng cho việc phân tích cú pháp  tài liệu XML
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            //Đối tượng đọc XML
            XMLReader xr = sp.getXMLReader();
 
            //Tạo đối tượng xử lý XML theo tuần tự của mình
            QuanlyXMLHandler myXMLHandler = new QuanlyXMLHandler();
            //Thiết lập nội dung xử lý
            xr.setContentHandler(myXMLHandler);
            //Nguồn dữ liệu vào
            InputSource inStream = new InputSource(is);
            //Bắt đầu xử lý dữ liệu vào
            xr.parse(inStream);
 
            // Lấy dữ liệu in thông tin cá nhân khách hàng
            String tua = myXMLHandler.getTuaTruyen();
            LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout1);
            /*TextView tv = new TextView(this);
            tv.setText("Tựa truyện:    " + tua);
            ll.addView(tv);*/
            	
            TextView tv_tua=(TextView) findViewById(R.id.tv_tua);
            tv_tua.setText("["+tua+"]");
            
            TextView tv = new TextView(this);
            tv.setText("");
            ll.addView(tv);
 
            //In chi tiết sản phẩm ra giao diện ứng dụng
            ArrayList<Doan> doanList = myXMLHandler.getDoanList();
            for (Doan doanCT : doanList) 
            {
                tv = new TextView(this);
                //tv.setText("Sản phẩm thứ : " + doanCT.getDoanSo());
                tv.setText(doanCT.getDoanSo());
                tv.setTextColor(Color.argb(255, 66, 0, 66));
                ll.addView(tv);
                
                tv = new TextView(this);
                tv.setText(" ");
                ll.addView(tv);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}