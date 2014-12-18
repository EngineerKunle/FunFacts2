package com.example.admin.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {

    public static final String TAG= FunFactsActivity.class.getSimpleName();

    private Factbook mFactBook = new Factbook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                // Update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
               relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                Toast.makeText(FunFactsActivity.this, "keep clicking", Toast.LENGTH_SHORT).show();

            }
        };
        showFactButton.setOnClickListener(listener);


      //Toast.makeText(this, "Yay! Our Activity was created", Toast.LENGTH_LONG).show();

        Log.d(TAG, "We are logging from the onCreate() method");

    }

}
