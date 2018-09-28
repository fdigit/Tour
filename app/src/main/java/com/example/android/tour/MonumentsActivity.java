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
 * {@link MonumentsActivity} shows a list of Monuments in Versailles.
 * For each Monuments, display the tittle, image and text.
 */
public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        // Find the View that shows the category header
        TextView header = (TextView) findViewById(R.id.Header);

        // Set the correct category name
        header.setText(R.string.Monuments);

        // Find the View that shows the home category
        ImageView home = (ImageView) findViewById(R.id.ic_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the monuments category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MonumentsActivity}
                Intent monumentsIntent = new Intent(MonumentsActivity.this, MainActivity.class);

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
                Intent eventsIntent = new Intent(MonumentsActivity.this, EventsActivity.class);

                // Start the new activity
                startActivity(eventsIntent);
                finish();
            }
        });

        // Find the View that shows the parks and gardens category
        ImageView parks = (ImageView) findViewById(R.id.ic_parks);

        // Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the parks and gardens category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(MonumentsActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(parksIntent);
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
                Intent restaurantsIntent = new Intent(MonumentsActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
                finish();
            }
        });


        // Create an ArrayList of Venue objects
        ArrayList<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(R.string.Chateau_Versailles_Tittle, R.string.Chateau_Versailles_text, R.drawable.chateau));
        venues.add(new Venue(R.string.Domaine_tittle, R.string.Domaine_text, R.drawable.domaine));
        venues.add(new Venue(R.string.Academy_tittle, R.string.Academy_text, R.drawable.academy));
        venues.add(new Venue(R.string.Senteur_tittle, R.string.Senteur_text, R.drawable.senteurs));
        venues.add(new Venue(R.string.Hotel_tittle, R.string.Hotel_text, R.drawable.hotel));
        venues.add(new Venue(R.string.Jeu_tittle, R.string.Jeu_text, R.drawable.salle));


        // Create an {@link VenuesAdapter}, whose data source is a list of
        // {@link Venue}s. The adapter knows how to create list item views for each item
        // in the list.
        com.example.android.tourguideversailles.VenuesAdapter venueAdapter = new com.example.android.tourguideversailles.VenuesAdapter(this, venues);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(venueAdapter);
    }
}