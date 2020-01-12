package stereo;

import Odtwarzacz.Song;

public class Mp3Player extends MusicPlayer{
    public Mp3Player(Song[] songs) {
        super(songs);
    }

    @Override
    public void play() {
        System.out.println("MP3 odtwarza " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop");
    }

    @Override
    public void pause() {
        System.out.println("MP3 pauza " + getCurrentSong());
    }

}
