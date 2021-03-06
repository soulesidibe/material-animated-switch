package com.github.glomadrian.materialanimatedswitch.painter;

/**
 * Painter delegate the onDraw method in canvas to draw method here, each painter paints something
 * of the view
 *
 * @author Adrián García Lomas
 */

import android.graphics.Canvas;

public interface Painter<T extends Enum> {

    void draw(Canvas canvas);

    int getColor();

    void setColor(int color);

    void onSizeChanged(int height, int width);

    void setState(T state);
}
