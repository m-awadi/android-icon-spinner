package com.liefery.android.icon_spinner.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Spinner;
import com.liefery.android.icon_spinner.IconSpinnerAdapter;

public class Activity extends android.app.Activity {

    Emotion[] emotions;

    @Override
    public void onCreate( Bundle state ) {
        super.onCreate( state );

        emotions = new Emotion[] {
            new Emotion( "Happy", "Mouth up", Color.GREEN, getResources()
                            .getDrawable( R.drawable.ic_happy_face ) ),
            new Emotion(
                "Neutral",
                null,
                Color.YELLOW,
                getResources().getDrawable( R.drawable.ic_neutral_face ) ),
            new Emotion( "Sad", "Mouth down", Color.RED, getResources()
                            .getDrawable( R.drawable.ic_sad_face ) ) };

        setContentView( R.layout.activity_main );

        Spinner spinner = findViewById( R.id.spinner );
        spinner.setAdapter( new IconSpinnerAdapter( this, emotions ) );
    }
}
