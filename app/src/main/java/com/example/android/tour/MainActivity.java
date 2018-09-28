package com.example.android.tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.example.android.tour.EventsActivity;
import com.example.android.tour.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the monuments category
        ImageView monuments = (ImageView) findViewById(R.id.ic_monuments);

        // Set a click listener on that View
        monuments.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the monuments category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MonumentsActivity}
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);

                // Start the new activity
                startActivity(monumentsIntent);
            }
        });

        // Find the View that shows the events and activities category
        ImageView events = (ImageView) findViewById(R.id.ic_events);

        // Set a click listener on that View
        events.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the events and activities category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsActivity}
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(eventsIntent);
            }
        });

        // Find the View that shows the parks and gardens category
        ImageView parks = (ImageView) findViewById(R.id.ic_parks);

        // Set a click listener on that View
        parks.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the parks and gardens category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(parksIntent);
            }
        });

        // Find the View that shows the restaurants category
        ImageView restaurants = (ImageView) findViewById(R.id.ic_restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });
    }
}

