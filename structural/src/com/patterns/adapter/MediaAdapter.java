package com.patterns.adapter;

import com.patterns.adapter.interfaces.IAdvancedMediaPlayer;
import com.patterns.adapter.interfaces.IMediaPlayer;

/**
 * created by: ufuk on 6.10.2020 14:10
 */
public class MediaAdapter implements IMediaPlayer {

    IAdvancedMediaPlayer player;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("avi")) {
            player = new AviPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            player = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("avi")) {
            player.playAvi(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            player.playMp4(fileName);
        }
    }
}
