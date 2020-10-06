package com.patterns.adapter;

import com.patterns.adapter.interfaces.IAdvancedMediaPlayer;

/**
 * created by: ufuk on 6.10.2020 14:08
 */
public class AviPlayer implements IAdvancedMediaPlayer {
    @Override
    public void playAvi(String fileName) {
        System.out.println("AviPlayer::playAvi -> " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("AviPlayer::playMp4 -> " + fileName);
    }
}
