package com.patterns.adapter;

import com.patterns.adapter.interfaces.IMediaPlayer;

import java.io.InvalidObjectException;

/**
 * created by: ufuk on 6.10.2020 14:12
 */
public class AudioPlayer implements IMediaPlayer {

    private MediaAdapter adapter;

    @Override
    public void play(String audioType, String fileName) throws InvalidObjectException {
        if (audioType.equalsIgnoreCase("avi") || audioType.equalsIgnoreCase("mp4")) {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("inbuilt support for mp3 file. Playing: " + fileName);
        } else {
            throw new InvalidObjectException("invalid media format : " + audioType);
        }
    }
}
