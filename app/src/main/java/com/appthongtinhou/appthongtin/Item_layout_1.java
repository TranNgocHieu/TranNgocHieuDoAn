package com.appthongtinhou.appthongtin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item_layout_1 extends AppCompatActivity {
    Button thoisu,kinhdoanh,thegioi,khoahoc;
    Button giadinh,phapluat,suckhoe,thethao;
    Button dulich,cuoi,giaoduc,giaitri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_layout_1);
        init();
        thoisu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/thoi-su.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);

            }
        });
        kinhdoanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/kinh-doanh.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);

            }
        });
        thegioi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/the-gioi.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);

            }
        });
        khoahoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/khoa-hoc.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        giadinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/gia-dinh.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        phapluat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/phap-luat.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        suckhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/suc-khoe.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        thethao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/the-thao.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        dulich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/du-lich.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        cuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/cuoi.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        giaoduc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/giao-duc.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
        giaitri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layoutChung=new Intent(Item_layout_1.this,ListView_layout_chung.class);
                String data="http://vnexpress.net/rss/giai-tri.rss";
                layoutChung.putExtra("database",data);
                startActivity(layoutChung);
            }
        });
    }
    public void init(){
        thoisu=(Button)findViewById(R.id.btn_thoisu);
        kinhdoanh=(Button)findViewById(R.id.btn_kinhdoanh);
        thegioi=(Button)findViewById(R.id.btn_thegioi);
        khoahoc=(Button)findViewById(R.id.btn_khoahoc);
        giadinh=(Button)findViewById(R.id.btn_giadinh);
        phapluat=(Button)findViewById(R.id.btn_phapluat);
        suckhoe=(Button)findViewById(R.id.btn_suckhoe);
        thethao=(Button)findViewById(R.id.btn_thethao);
        dulich=(Button)findViewById(R.id.btn_dulich);
        cuoi=(Button)findViewById(R.id.btn_cuoi);
        giaoduc=(Button)findViewById(R.id.btn_giaoduc);
        giaitri=(Button)findViewById(R.id.btn_giaitri);
    }
}
