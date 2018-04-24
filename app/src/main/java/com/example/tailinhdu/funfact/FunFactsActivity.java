package com.example.tailinhdu.funfact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.tailinhdu.funfact.R.id.factTextView;
import static com.example.tailinhdu.funfact.R.id.showFactButton;

public class FunFactsActivity extends AppCompatActivity {
    //Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        factTextView = (TextView)findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //The button was clicked ,do update the fact TextView with a new fact.
                String fact = "Ostriches can run faster than horses";
                factTextView.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);

    }
}
