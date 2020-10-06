package com.patterns.adapter;

import java.io.InvalidObjectException;

/**
 * created by: ufuk on 6.10.2020 14:16
 */
public class App {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        try {
            audioPlayer.play("mp3", "mySong.mp3");
            audioPlayer.play("mp4", "myVideo.mp4");
            audioPlayer.play("avi", "myVideo.avi");
            audioPlayer.play("webm", "myVideo.webm");
        } catch (InvalidObjectException e) {
            System.out.println(e.getMessage());
        }

    }
}
