package com.patterns.bridge.platform;

import com.patterns.bridge.Song;
import com.patterns.bridge.interfaces.IPlatform;

/**
 * created by: ufuk on 6.10.2020 15:27
 */
public class Spotify implements IPlatform {
    @Override
    public String playMusic(Song song) {
        System.out.println("Spotify playing the song: " + song);
        return song.getName();
    }

    @Override
    public String toString() {
        return "Spotify";
    }
}
