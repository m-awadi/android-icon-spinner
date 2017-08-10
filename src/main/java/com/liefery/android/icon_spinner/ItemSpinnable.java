package com.liefery.android.icon_spinner;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface ItemSpinnable {

    @NonNull
    String getTitle();

    @Nullable
    String getSubtitle();

    @NonNull
    int getColor();

    @NonNull
    Drawable getIconDrawable();

}
