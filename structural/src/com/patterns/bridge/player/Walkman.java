package com.patterns.bridge.player;

import com.patterns.bridge.Device;
import com.patterns.bridge.Song;
import com.patterns.bridge.sound.Headphone;
import com.patterns.bridge.platform.Spotify;

/**
 * created by: ufuk on 6.10.2020 15:30
 */
public class Walkman extends Device {

    public Walkman() {
        iSound = new Headphone();
        iPlatform = new Spotify();
    }

    @Override
    public void playSong(Song song) {
        System.out.println("device playing the song:" + song.getName());
    }

    @Override
    public String toString() {
        return "Walkman{" +
                "iSound=" + iSound +
                ", iPlatform=" + iPlatform +
                '}';
    }
}
