package org.effectivejava.examples.ch02.item18;

import java.applet.AudioClip;

public interface SingerSongwriter extends Singer, Songwriter {
    AudioClip strum();

    void actSensitive();
}
