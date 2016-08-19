package io.github.akshayadinesh.foodscan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class PaneraMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panera_menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.soups, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        LinearLayout item1 = (LinearLayout) findViewById(R.id.item1);
        LinearLayout item2 = (LinearLayout) findViewById(R.id.item2);
        LinearLayout item3 = (LinearLayout) findViewById(R.id.item3);
        LinearLayout item4 = (LinearLayout) findViewById(R.id.item4);
        LinearLayout item5 = (LinearLayout) findViewById(R.id.item5);
        LinearLayout item6 = (LinearLayout) findViewById(R.id.item6);
        LinearLayout item7 = (LinearLayout) findViewById(R.id.item7);
        item1.setVisibility(View.VISIBLE);
        item2.setVisibility(View.VISIBLE);
        item3.setVisibility(View.VISIBLE);
        item4.setVisibility(View.VISIBLE);
        item5.setVisibility(View.VISIBLE);
        item6.setVisibility(View.VISIBLE);
        item7.setVisibility(View.VISIBLE);
        return super.onOptionsItemSelected(item);
    }


}
