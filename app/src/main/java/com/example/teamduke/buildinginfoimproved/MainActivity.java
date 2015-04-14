package com.example.teamduke.buildinginfoimproved;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("UnusedDeclaration")
    public void showPhoto (View view){

        Intent getBuilding = new Intent();
        getBuilding.setClass(this, BuildingActivity.class);

        switch (view.getId()){

            case R.id.abbey_Building:
                setContentView(R.layout.activity_abbey);
                 break;

            case R.id.Bishops_Building:
                setContentView(R.layout.activity_bishops);
                break;

            case R.id.cathedral:
                setContentView(R.layout.activity_catherdral);
                break;

            case R.id.Deans:
                setContentView(R.layout.activity_deans);
                break;

            case R.id.Gibney:
                setContentView(R.layout.activity_gibney);
                break;

            case R.id.Knights:
                setContentView(R.layout.activity_knights);
                break;

            case R.id.Monks:
                setContentView(R.layout.activity_monks);
                break;

            case R.id.sessions_Restaurant:
                setContentView(R.layout.activity_sessions);
                break;

            case R.id.Temple:
                setContentView(R.layout.activity_temple);
                break;

        }


    }
    @Override
    public void onDrawerItemSelected(View view, int position) {

    }
}
