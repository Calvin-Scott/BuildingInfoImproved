package com.example.teamduke.buildinginfoimproved;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;



public class BuildingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_building, menu);
        return true;
    }


}
