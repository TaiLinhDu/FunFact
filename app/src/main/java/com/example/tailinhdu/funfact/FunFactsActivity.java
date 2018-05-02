package com.example.tailinhdu.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends AppCompatActivity {
    //String name of class
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    //Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        factTextView = (TextView)findViewById(R.id.textView);
        showFactButton = (Button) findViewById(R.id.mainbutton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        //when button is tapped
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                //update the screen with our new fact
                factTextView.setText(fact);
                //change color background
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                //change color button
                showFactButton.setTextColor(color);
            }
        };
        //
        showFactButton.setOnClickListener(listener);
        //Toast for kurze Zeit
       //Toast.m akeText(this, "Yay! Our Activity was created!!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}
