package com.example.steve.sumosticks.framework;

/**
 * Created by elliott on 4/22/2015.
 */
public interface Game {

    public Input getInput();
    public FileIO getFileIO();
    public Graphics getGraphics();
    public Audio getAudio();
    public void setScreen(Screen screen);
    public Screen getCurrentScreen();
    public Screen getStartScreen();
}
