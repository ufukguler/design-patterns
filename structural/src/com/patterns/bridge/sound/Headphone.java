package com.patterns.bridge.sound;

import com.patterns.bridge.interfaces.ISound;

/**
 * created by: ufuk on 6.10.2020 15:22
 */
public class Headphone implements ISound {
    @Override
    public void makeSound(String sound) {
        System.out.println("Headphone makes sound, playing: " + sound);
    }

    @Override
    public String toString() {
        return "Headphone";
    }
}
