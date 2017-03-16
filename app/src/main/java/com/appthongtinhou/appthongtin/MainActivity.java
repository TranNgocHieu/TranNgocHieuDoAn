package com.appthongtinhou.appthongtin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView express,dantri,bao24h,search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        express=(ImageView)findViewById(R.id.img_express);
        dantri=(ImageView)findViewById(R.id.img_dantri);
        bao24h=(ImageView)findViewById(R.id.img_doc24h);
        search=(ImageView)findViewById(R.id.img_search);
        express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Item_layout_1.class);
                startActivity(intent);
            }
        });

    }
    protected void CreatMenu(Menu menu){
        menu.add(0,0,0,"Express");
        menu.add(0,1,1,"dantri");
        menu.add(0,2,2,"24h.com.vn");
        menu.add(0,3,3,"tìm kiếm");

    }
}
