package com.ptit.starbuckapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = Drink.drinkList[drinkNo];

        //set thong tin cho ImageView
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageId());
        photo.setContentDescription(drink.getDiscr());

        //set thong tin cho TextView name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        //set thong tin cho textView Description
        TextView descr = (TextView) findViewById(R.id.discr);
        descr.setText(drink.getDiscr());
    }

}
