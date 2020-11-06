package com.example.vidu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ChildActivity extends AppCompatActivity {
ArrayList<String> arr;
ArrayAdapter ad;
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Intent myItent =  getIntent();
        ImageView imageView=(ImageView)findViewById(R.id.hinh);
        TextView text1 = (TextView)findViewById(R.id.txTen);
        TextView text2 = (TextView)findViewById(R.id.txSdt);
        lv=(ListView)findViewById(R.id.LV);
        arr = new ArrayList<>();
        arr.add("Thứ 4 Ngày 26/10/2020 4:23 CH");
        arr.add("Thứ 4 Ngày 26/10/2020 4:23 CH");
        arr.add("Thứ 4 Ngày 26/10/2020 4:23 CH");
        arr.add("Thứ 4 Ngày 26/10/2020 4:23 CH");
        ad = new ArrayAdapter(ChildActivity.this,android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(ad);
text1.setText(myItent.getStringExtra("Ten"));
        text2.setText(myItent.getStringExtra("Sdt"));
        imageView.setImageResource(myItent.getIntExtra("Hinh",1));
    }
}
