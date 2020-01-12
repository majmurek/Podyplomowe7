package Odtwarzacz;

public class Mp3 extends MusicPlayer {
    Mp3 (String type){
        this.type = type;
    }

    String showType() {
       return "mp3 " + type;
    }
}
