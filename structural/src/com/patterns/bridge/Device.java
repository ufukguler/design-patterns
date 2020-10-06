package com.patterns.bridge;

import com.patterns.bridge.interfaces.IDevice;
import com.patterns.bridge.interfaces.ISound;
import com.patterns.bridge.interfaces.IPlatform;

/**
 * created by: ufuk on 6.10.2020 15:23
 */
public class Device implements IDevice {
    protected ISound iSound;
    protected IPlatform iPlatform;

    public Device() {
    }

    @Override
    public void playSong(Song song) {
        String sound = iPlatform.playMusic(song);
        iSound.makeSound(sound);
    }

}
