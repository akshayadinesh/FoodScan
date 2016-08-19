package io.github.akshayadinesh.foodscan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class HomePageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab != null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                    intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
                    startActivityForResult(intent, 0); //Barcode Scanner to scan for us
                }
            });
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
//        switch(view.getId()) {
//            case R.id.checkbox_meat:
//                if (checked)
//                else
//                    Toast.makeText(this,"No Meat!",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.checkbox_cheese:
//                if (checked)
//                    Toast.makeText(this,"Cheese!",Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(this,"No cheese!",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.checkbox_milk:
//                if (checked)
//                    Toast.makeText(this,"Milk!",Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(this,"No milk!",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.checkbox_eggs:
//                if (checked)
//                    Toast.makeText(this,"Eggs!",Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(this,"No eggs!",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.checkbox_gluten:
//                if (checked)
//                    Toast.makeText(this,"Gluten!",Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(this,"No gluten!",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.checkbox_peanuts:
//                if (checked)
//                    Toast.makeText(this,"Peanuts!",Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(this,"No peanuts!",Toast.LENGTH_SHORT).show();
//                break;
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void scanNow(View view) {

    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                Intent intent1 = new Intent(this, PaneraMenu.class);
                startActivity(intent1);
            } else if (resultCode == RESULT_CANCELED) {
                Intent intent2 = new Intent(this, PaneraMenu.class);
                startActivity(intent2);
            }
        }
    }
}
