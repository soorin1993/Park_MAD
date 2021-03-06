package com.example.soorinpark.beerbelly;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.apache.http.client.methods.HttpGet;

import java.net.URI;

/**
 * Created by soorinpark on 11/8/16.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Typeface headFont = Typeface.createFromAsset(getAssets(), "fonts/Bungee-Regular.ttf");
        Typeface bodyFont = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Regular.ttf");

        //BEER BELLY Title
        TextView titleTextView = (TextView) findViewById(R.id.textView);
        titleTextView.setTypeface(headFont);

        //I like...
        TextView likeTextView = (TextView) findViewById(R.id.textView2);
        EditText likeEditText = (EditText) findViewById(R.id.editText);
        likeTextView.setTypeface(headFont);
        likeEditText.setTypeface(bodyFont);

        //I live in...
        TextView liveTextView = (TextView) findViewById(R.id.textView3);
        EditText liveEditText = (EditText) findViewById(R.id.editText2);
        liveTextView.setTypeface(headFont);
        liveEditText.setTypeface(bodyFont);

        //button
        Button drinkButton = (Button) findViewById(R.id.drinkButton);
        drinkButton.setTypeface(bodyFont);

        if (savedInstanceState == null) {
            TestFragment trendsFragment = new TestFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, trendsFragment).commit();
        }
    }

    public void changeView(View view)
    {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }
}
