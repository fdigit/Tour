package com.example.android.tour;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link EventsActivity} shows a list of Events in Versailles.
 * For each Events, display the tittle, image and text.
 */
public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        // Find the View that shows the category header
        TextView header = (TextView) findViewById(R.id.Header);

        // Set the correct category name
        header.setText(R.string.Events);

        // Find the View that shows the home category
        ImageView home = (ImageView) findViewById(R.id.ic_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(EventsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
                finish();
            }
        });

        // Find the View that shows the monuments category
        ImageView monuments = (ImageView) findViewById(R.id.ic_monuments);

        // Set a click listener on that View
        monuments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the monuments category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MonumentsActivity}
                Intent monumentsIntent = new Intent(EventsActivity.this, MonumentsActivity.class);

                // Start the new activity
                startActivity(monumentsIntent);
                finish();
            }
        });

        // Find the View that shows the restaurants category
        ImageView restaurants = (ImageView) findViewById(R.id.ic_restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(EventsActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
                finish();
            }
        });


        // Find the View that shows the parks category
        ImageView parks = (ImageView) findViewById(R.id.ic_parks);

        // Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the parks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(EventsActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(parksIntent);
                finish();
            }
        });

        // Create an ArrayList of Venue objects
        ArrayList<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(R.string.musicale_tittle, R.string.musicale_text, R.drawable.musicale));
        venues.add(new Venue(R.string.nocturne_tittle, R.string.nocturne_text, R.drawable.nocturne));
        venues.add(new Venue(R.string.boat_tittle, R.string.boat_text, R.drawable.boat));
        venues.add(new Venue(R.string.bartabas_tittle, R.string.bartabas_text, R.drawable.bartabas));


        // Create an {@link VenuesAdapter}, whose data source is a list of
        // {@link Venue}s. The adapter knows how to create list item views for each item
        // in the list.
        com.example.android.tourguideversailles.VenuesAdapter venueAdapter = new com.example.android.tourguideversailles.VenuesAdapter(this, venues);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(venueAdapter);
    }
}
