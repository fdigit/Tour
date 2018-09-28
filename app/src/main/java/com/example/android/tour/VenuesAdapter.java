package com.example.android.tourguideversailles;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tour.R;
import com.example.android.tour.Venue;

import java.util.ArrayList;

/*
 * {@link VenueAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Venue} objects.
 * */
public class VenuesAdapter extends ArrayAdapter<Venue> {

    private static final String LOG_TAG = VenuesAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param venues  A List of Venue objects to display in a list
     */
    public VenuesAdapter(Activity context, ArrayList<Venue> venues) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, venues);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Venue} object located at this position in the list
        Venue currentVenue = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID tittle_item
        TextView tittleTextView = (TextView) listItemView.findViewById(R.id.tittle_item);
        // Get the venue tittle from the current Venue object and
        // set this text on the Tittle TextView
        tittleTextView.setText(currentVenue.getVenueTittle());

        // Find the TextView in the list_item.xml layout with the ID text_item
        TextView textTextView = (TextView) listItemView.findViewById(R.id.text_item);
        // Get the venue text from the current Venue object and
        // set this text on the text TextView
        textTextView.setText(currentVenue.getVenueText());

        // Find the ImageView in the list_item.xml layout with the ID phot_item
        ImageView photoView = (ImageView) listItemView.findViewById(R.id.photo_item);
        // Get the image resource ID from the current Venue object and
        // set the image to photoView
        photoView.setImageResource(currentVenue.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}