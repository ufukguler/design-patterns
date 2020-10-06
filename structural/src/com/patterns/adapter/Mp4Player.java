package com.patterns.adapter;

import com.patterns.adapter.interfaces.IAdvancedMediaPlayer;

/**
 * created by: ufuk on 6.10.2020 14:09
 */
public class Mp4Player implements IAdvancedMediaPlayer {
    @Override
    public void playAvi(String fileName) {
        // not supported
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player::playMp4 -> " + fileName);
    }
}
