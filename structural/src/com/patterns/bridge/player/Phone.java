package com.patterns.bridge.player;

import com.patterns.bridge.Device;
import com.patterns.bridge.Song;
import com.patterns.bridge.sound.Speaker;
import com.patterns.bridge.platform.AppleMusic;

/**
 * created by: ufuk on 6.10.2020 15:36
 */
public class Phone extends Device {

    public Phone() {
        iSound = new Speaker();
        iPlatform = new AppleMusic();
    }

    @Override
    public void playSong(Song song) {
        System.out.println("device playing the song:" + song.getName());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "iSound=" + iSound +
                ", iPlatform=" + iPlatform +
                '}';
    }
}
