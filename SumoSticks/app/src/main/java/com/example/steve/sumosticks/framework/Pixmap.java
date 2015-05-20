package com.example.steve.sumosticks.framework;

/**
 * Created by elliott on 4/22/2015.
 */
import com.example.elliott.framework.Graphics.PixmapFormat;

public interface Pixmap {
    public int getHeight();
    public int getWidth();
    public PixmapFormat getFormat();
    public void dispose();
}
