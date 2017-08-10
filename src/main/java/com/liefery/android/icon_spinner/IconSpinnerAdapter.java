package com.liefery.android.icon_spinner;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class IconSpinnerAdapter extends ArrayAdapter<ItemSpinnable> {

    private ItemSpinnable[] spinnerEntries;

    public <E extends ItemSpinnable> IconSpinnerAdapter(
        Context context,
        E[] spinnerEntries ) {
        super( context, R.layout.spinner_item, spinnerEntries );

        this.spinnerEntries = spinnerEntries;
    }

    @Override
    public View getDropDownView( int position, View view, ViewGroup parent ) {
        return getCustomView( position, parent );
    }

    @Override
    public View getView( int pos, View view, ViewGroup parent ) {
        return getCustomView( pos, parent );
    }

    private View getCustomView( int position, ViewGroup parent ) {
        ItemSpinnable item = spinnerEntries[position];

        // Getting a LayoutInflater and inflating layouts based on subtitle
        // availability
        LayoutInflater inflater = (LayoutInflater) getContext()
                        .getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        ViewGroup spinnerView = (ViewGroup) inflater.inflate( item
                        .getSubtitle() != null ? R.layout.spinner_item
                        : R.layout.spinner_item_no_sub, parent, false );

        // Setting the title text
        TextView title = spinnerView.findViewById( R.id.title );
        title.setText( item.getTitle() );

        // Setting the Subtitle, guarded by the if because the view is null when
        // no Subtitle is set.
        if ( item.getSubtitle() != null ) {
            TextView subTitle = spinnerView.findViewById( R.id.subtitle );
            subTitle.setText( item.getSubtitle() );
        }

        // Setting the Image Drawable
        ImageView iconView = spinnerView.findViewById( R.id.icon );
        iconView.setImageDrawable( item.getIconDrawable() );

        // Setting the color of the background shape of the drawable
        GradientDrawable drawable = (GradientDrawable) iconView.getBackground();
        drawable.setColor( item.getColor() );

        return spinnerView;
    }
}
