package com.example.geochallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CityHomeActivity extends AppCompatActivity {
    private Button level1, level2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_home);

        levelButton();
        clickMe();


    }

    private void clickMe() {
        //set onclick button listener
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //can create intent here to take to next page
                //but for test, put toast message
                Toast.makeText(CityHomeActivity.this, "Level One Selected", Toast.LENGTH_SHORT).show();
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CityHomeActivity.this,"level Two Selected",Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void levelButton() {
        level1 = (Button) findViewById(R.id.cityLevel1button);
        level2 = (Button) findViewById(R.id.cityLevel2button);
    }
}