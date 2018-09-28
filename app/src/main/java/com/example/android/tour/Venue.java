package com.example.android.tour;


/**
 * {@link Venue} represents a venue from a category.
 * Each object has 3 properties: tittle, image resource ID and a text.
 */
public class Venue {

    // Tittle of the Venue (e.g. Chateau de Versailles, Le park du Chateau, Bike Tour)
    private int mTittleItem;

    // Text of the Venue
    private int mTextItem;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new Venue object.
     *
     * @param vTittle is the name of the Venue
     * @param vText is the corresponding text of the Venue
     * @param image is drawable reference ID that corresponds to the venue
     * */
    public Venue(int vTittle, int vText, int imageResourceId) {
        mTittleItem = vTittle;
        mTextItem = vText;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the tittle of the Venue
     */
    public int getVenueTittle() {
        return mTittleItem;
    }


    /**
     * Get the text of the Venue
     */
    public int getVenueText() {
        return mTextItem;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}