package com.example.vidu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
public class PeopleAdapter extends BaseAdapter{
private Context context;
private int layout;
private List<People> peopleList;
    People people;

    public PeopleAdapter(Context context, int layout, List<People> peopleList) {
        this.context = context;
        this.layout = layout;
        this.peopleList = peopleList;
    }

    @Override
    public int getCount() {
        return peopleList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txtTen = (TextView)view.findViewById(R.id.ten);
        TextView txtSdt = (TextView)view.findViewById(R.id.sdt);
        ImageView imgHinh = (ImageView)view.findViewById(R.id.hinh);

       people = peopleList.get(position);
        txtTen.setText(people.getTen());
        txtSdt.setText(people.getSdt());
        imgHinh.setImageResource(people.getHinh());
        return view;
    }


}
