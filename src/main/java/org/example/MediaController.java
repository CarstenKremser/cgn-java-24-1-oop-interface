package org.example;

public class MediaController {

    public void playMedia(Playable playable) {
        System.out.print("Media player: ");
        playable.play();
    }
}
