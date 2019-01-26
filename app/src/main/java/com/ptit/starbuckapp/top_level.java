package com.ptit.starbuckapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class top_level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> listView,
                                    View itemView,
                                    int pos, long id){
                if(pos == 0){
                    Intent intent = new Intent(top_level.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = (ListView) findViewById(R.id.top_level_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
