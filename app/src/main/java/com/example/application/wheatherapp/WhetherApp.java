package com.example.application.wheatherapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class WhetherApp extends AppCompatActivity {
    private AppCompatEditText city;
    private AppCompatEditText temperature;
    private AppCompatEditText units;
    private AppCompatButton save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whether_app);
        Log.d("WhetherApp","onCreate");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        city=findViewById(R.id.edt_city);
        temperature=findViewById(R.id.edt_temp);
        units=findViewById(R.id.edt_unit);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(city.getText().toString().length()>15){
                    Toast.makeText(WhetherApp.this, "Enter Appropriate Name", Toast.LENGTH_SHORT).show();
                }
                if (temperature.getText().toString().length() > 3) {
                    Toast.makeText(WhetherApp.this, "Wrong value", Toast.LENGTH_SHORT).show();
                }
                if(units.getText().toString().length()<2){
                    Toast.makeText(WhetherApp.this, "enter valuable unit", Toast.LENGTH_SHORT).show();
                }
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater getMenuInflater=getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_whether_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(this, "settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if(id==R.id.action_Logout){
            Toast.makeText(this, "logout clicked", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.action_add){
            Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
