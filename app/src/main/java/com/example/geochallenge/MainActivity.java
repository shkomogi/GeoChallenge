package com.example.geochallenge;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Started001";

    private Button citybutton, statesButton,flagsButton,pngButton,scoreboardButton;
    //private Button aboutButton,exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        challengeActivity();


    }

    private void challengeActivity() {
        citybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cityintent = new Intent(MainActivity.this,CityHomeActivity.class);
                startActivity(cityintent);
            }
        });
        flagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent flagIntent = new Intent(MainActivity.this,FlagsHomeActivity.class);
                startActivity(flagIntent);
            }
        });
        statesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent statesIntent= new Intent(MainActivity.this,StatesHomeActivity.class);
                startActivity(statesIntent);
            }
        });
        pngButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pngIntent = new Intent(MainActivity.this,PngHomeActivity.class);
                startActivity(pngIntent);
            }
        });
        scoreboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scoreboardIntent = new Intent(MainActivity.this,ScoreboardActivity.class);
                startActivity(scoreboardIntent);
            }
        });
    }


    private void initWidgets() {
        citybutton = (Button) findViewById(R.id.CityChallengeBttn);
        statesButton = (Button) findViewById(R.id.StatesChallengeBttn);
        flagsButton = (Button) findViewById(R.id.FlagsChallengeBttn);
        pngButton = (Button) findViewById(R.id.pngchallengeBttn);
        scoreboardButton= (Button) findViewById(R.id.ScoreboardBttn);
        //aboutButton = (Button) findViewById(R.id.AboutHomeBttn);
        //exitButton = (Button) findViewById(R.id.ExitHomeBttn);

    }


    //Override existing onCreate method for Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }
    private void aboutApp(){
        AlertDialog.Builder aboutapp = new AlertDialog.Builder(this);
        final String AboutDialogMessage = "\t Geo Challenge " +
                "Version 1.0\n \t By Developer Shirley Komogi\n \t Papua New Guinea (PNG)"+
                "For test of General Geography knowledge ";
        final TextView tx = new TextView(this);
        tx.setText(AboutDialogMessage);
        tx.setTextColor(Color.BLACK);
        tx.setTextSize(13);
        aboutapp.setIcon(R.drawable.ic_geoapplogo);
        aboutapp.setTitle("About this app");
        aboutapp.setView(tx);
        aboutapp.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        aboutapp.show();

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){  //this case has to show a buildDialog
            case R.id.aboutMenu1:
                aboutApp();
                Toast.makeText(MainActivity.this,"Closing 'About GeoChallenge'",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.exitMenu2:  //this case has to save then exit
                finish();
               Toast.makeText(MainActivity.this,"Closing App",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}