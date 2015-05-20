package com.example.steve.sumosticks.framework;

/**
 * Created by elliott on 4/22/2015.
 */
public interface Music{
    public void play();
    public void stop();
    public void pause();
    public void setLooping(boolean looping);
    public void setVolume(float volume);
    public boolean isPlaying();
    public boolean isStopped();
    public boolean isLooping();
    public void dispose();
}
