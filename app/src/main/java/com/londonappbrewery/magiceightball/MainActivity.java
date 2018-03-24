package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link the eightBall display with display id//
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        //Set Array for all different balls//
        final int [] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        //Link the button with button id//
        Button myButton;

        myButton = (Button) findViewById(R.id.askButton);


        //Set On click listener to button//
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                //Set the array to ballDisplay//
                ballDisplay.setImageResource(ballArray[number]);


            }
        });





    }
}
