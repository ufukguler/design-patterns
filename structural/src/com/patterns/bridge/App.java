package com.patterns.bridge;

import com.patterns.bridge.player.Phone;
import com.patterns.bridge.player.Walkman;

/**
 * created by: ufuk on 6.10.2020 15:09
 */
public class App {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Walkman walkman = new Walkman();

        Song song = new Song("the do", "despair hangouver & extacy");
        Song song2 = new Song("russian red", "fuerteventura");

        phone.iSound.makeSound(song.getSinger());
        phone.playSong(song);

        System.out.println();

        walkman.iSound.makeSound(song.getSinger());
        walkman.playSong(song2);
    }
}
