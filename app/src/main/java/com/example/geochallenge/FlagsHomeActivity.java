package com.example.geochallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FlagsHomeActivity extends AppCompatActivity {

    private Button level1,level2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flags_home);

        flagLevelButton();
        flagClickme();
    }

    private void flagLevelButton() {
        level1 = (Button) findViewById(R.id.flagLevel1button);
        level2 = (Button) findViewById(R.id.cityLevel2button);
    }

    private void flagClickme() {
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FlagsHomeActivity.this,"Level One Selected",Toast.LENGTH_SHORT).show();
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FlagsHomeActivity.this,"Level Two Selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}