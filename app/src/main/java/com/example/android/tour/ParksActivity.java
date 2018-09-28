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
 * {@link ParksActivity} shows a list of Parks in Versailles.
 * For each Parks, display the tittle, image and text.
 */
public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        // Find the View that shows the category header
        TextView header = (TextView) findViewById(R.id.Header);

        // Set the correct category name
        header.setText(R.string.Parks);

        // Find the View that shows the home category
        ImageView home = (ImageView) findViewById(R.id.ic_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(ParksActivity.this, MainActivity.class);

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
                Intent monumentsIntent = new Intent(ParksActivity.this, MonumentsActivity.class);

                // Start the new activity
                startActivity(monumentsIntent);
                finish();
            }
        });

        // Find the View that shows the events and activities category
        ImageView events = (ImageView) findViewById(R.id.ic_events);

        // Set a click listener on that View
        events.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the events and activities category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsActivity}
                Intent eventsIntent = new Intent(ParksActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(eventsIntent);
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
                Intent restaurantsIntent = new Intent(ParksActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
                finish();
            }
        });


        // Create an ArrayList of Venue objects
        ArrayList<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(R.string.Parc_tittle, R.string.Parc_text, R.drawable.parc_chateau));
        venues.add(new Venue(R.string.Suisse_tittle, R.string.Suisse_text, R.drawable.suisse));
        venues.add(new Venue(R.string.Potager_tittle, R.string.Potager_text, R.drawable.potager));
        venues.add(new Venue(R.string.chevreloup_tittle, R.string.chevreloup_text, R.drawable.chevreloup));
        venues.add(new Venue(R.string.Madame_tittle, R.string.Madame_text, R.drawable.madame));
        venues.add(new Venue(R.string.balbi_tittle, R.string.balbi_text, R.drawable.balbi));


        // Create an {@link VenuesAdapter}, whose data source is a list of
        // {@link Venue}s. The adapter knows how to create list item views for each item
        // in the list.
        com.example.android.tourguideversailles.VenuesAdapter venueAdapter = new com.example.android.tourguideversailles.VenuesAdapter(this, venues);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(venueAdapter);
    }
}