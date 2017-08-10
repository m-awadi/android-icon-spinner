package com.liefery.android.icon_spinner.sample;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liefery.android.icon_spinner.ItemSpinnable;

public class Emotion implements ItemSpinnable {

    private String name;

    private String expression;

    private int emotionColor;

    private Drawable emotionDrawable;

    public Emotion(
        String name,
        String expression,
        int emotionColor,
        Drawable emotionDrawable ) {
        this.name = name;
        this.expression = expression;
        this.emotionColor = emotionColor;
        this.emotionDrawable = emotionDrawable;
    }

    @Override
    @NonNull
    public String getTitle() {
        return name;
    }

    @Override
    @Nullable
    public String getSubtitle() {
        return expression;
    }

    @Override
    @NonNull
    public int getColor() {
        return emotionColor;
    }

    @Override
    @NonNull
    public Drawable getIconDrawable() {
        return emotionDrawable;
    }

}
