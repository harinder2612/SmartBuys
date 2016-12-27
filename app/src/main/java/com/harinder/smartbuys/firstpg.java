package com.harinder.smartbuys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class firstpg extends AppCompatActivity {
ImageView img;
    TextView tv1;
    EditText e1;
   static int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpg);
        img= (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.oneplus);
        tv1= (TextView) findViewById(R.id.textview2);
        tv1.setText("One Plus 3T");
        e1= (EditText) findViewById(R.id.editText);
        e1.setText("Price: 28000 rs\nStorage Capacity: 64/128 GB\nProcessor: Snapdragon 821" +
                "\nBack Camera: 16 MP\nFront Camera: 16 MP\nBattery: 3400 mAh\nRating: 4.8");
    }

    public void next(View v)
    {if(i<4) {
        i++;
        switch (i) {
            case 1:
                img.setImageResource(R.drawable.iphone7);
                tv1.setText("iphone 7 plus");
                e1.setText("Price: 92000 rs\nStorage Capacity: 32/128 GB\nProcessor: Apple A10 Fusion" +
                        "\nBack Camera: 12 MP\nFront Camera: 7 MP\nBattery: 2900 mAh\nRating: 4.3");
                break;
            case 2:
                img.setImageResource(R.drawable.s7edge);
                tv1.setText("S7 Edge");
                e1.setText("Price: 51000 rs\nStorage Capacity: 32/64 GB\nProcessor: Snapdragon 820" +
                        "\nBack Camera: 12 MP\nFront Camera: 5 MP\nBattery: 3600 mAh\nRating: 4.0");
                break;
            case 3:
                img.setImageResource(R.drawable.htc);
                tv1.setText("HTC M10 Gold");
                e1.setText("Price: 38000 rs\nStorage Capacity: 32/64 GB\nProcessor: Snapdragon 820" +
                        "\nBack Camera: 12 MP\nFront Camera: 15 MP\nBattery: 3000 mAh\nRating: 4.2");
                break;
            case 4:
                img.setImageResource(R.drawable.motorola);
                tv1.setText("Motorola G4 Plus");
                e1.setText("Price: 15000 rs\nStorage Capacity: 16 GB\nProcessor: Snapdragon 616" +
                        "\nBack Camera: 16 MP\nFront Camera: 5 MP\nBattery: 3000 mAh\nRating: 3.9");
                break;
        }
              }
    }

    public void previous(View v)
    {
        if(i>0)
        {i--;
        switch (i)
        {
            case 0:img.setImageResource(R.drawable.oneplus);
                tv1.setText("One Plus 3T");
                e1.setText("Price: 28000 rs\nStorage Capacity: 64/128 GB\nProcessor: Snapdragon 821" +
                        "\nBack Camera: 16 MP\nFront Camera: 16 MP\nBattery: 3400 mAh\nRating: 4.8");
                break;
            case 1:img.setImageResource(R.drawable.iphone7);
                tv1.setText("iphone 7 plus");
                e1.setText("Price: 92000 rs\nStorage Capacity: 32/128 GB\nProcessor: Apple A10 Fusion" +
                        "\nBack Camera: 12 MP\nFront Camera: 7 MP\nBattery: 2900 mAh\nRating: 4.3");
                break;
            case 2:img.setImageResource(R.drawable.s7edge);
                tv1.setText("S7 Edge");
                e1.setText("Price: 51000 rs\nStorage Capacity: 32/64 GB\nProcessor: Snapdragon 820" +
                        "\nBack Camera: 12 MP\nFront Camera: 5 MP\nBattery: 3600 mAh\nRating: 4.0");
                break;
            case 3:
                img.setImageResource(R.drawable.htc);
                tv1.setText("HTC M10 Gold");
                e1.setText("Price: 38000 rs\nStorage Capacity: 32/64 GB\nProcessor: Snapdragon 820" +
                        "\nBack Camera: 12 MP\nFront Camera: 15 MP\nBattery: 3000 mAh\nRating: 4.2");
                break;
            case 4:
                img.setImageResource(R.drawable.motorola);
                tv1.setText("Motorola G4 Plus");
                e1.setText("Price: 15000 rs\nStorage Capacity: 16 GB\nProcessor: Snapdragon 616" +
                        "\nBack Camera: 16 MP\nFront Camera: 5 MP\nBattery: 3000 mAh\nRating: 3.9");
                break;
        }}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_firstpg, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
