package com.patterns.adapter.interfaces;

import java.io.InvalidObjectException;

/**
 * created by: ufuk on 6.10.2020 14:07
 * basic skill of media player which is playing the media
 */
public interface IMediaPlayer {
    void play(String audioType, String fileName) throws InvalidObjectException;
}
