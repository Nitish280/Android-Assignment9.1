package com.example.nitishsingh.android91;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //here we are using menu inflater to create
        // the menu from menu resource file
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_new, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // here we are Handle item selection
        switch (item.getItemId()) {
            case R.id.Red:
                textView.setTextColor(Color.RED);
                return true;
            case R.id.Green:
                textView.setTextColor(Color.GREEN);
                return true;
            case R.id.Blue:
                textView.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
