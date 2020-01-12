package stereo;

import Odtwarzacz.Song;

public class CDPlayer extends MusicPlayer {
    public CDPlayer(Song[] songs) {
        super(songs);
    }

    @Override
    public void play() {
        System.out.println("CD odtwarza " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("CD stop");
    }

    @Override
    public void pause() {
        System.out.println("CD pauza " + getCurrentSong());
    }



}
