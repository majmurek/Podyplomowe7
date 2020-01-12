package Odtwarzacz;

abstract public class MusicPlayer implements Player{
    String type;

    MusicPlayer(){
        this.type = type;
    }

    public void Play(){
        System.out.println("Odtwórz ");

    }

    public void Stop(){
        System.out.println("Zatrzymaj ");

    }

    public void NextSong(){
        System.out.println("Następna piosenka ");

    }

    public void PreviousSong(){
        System.out.println("Poprzednia piosenka ");

    }

}

