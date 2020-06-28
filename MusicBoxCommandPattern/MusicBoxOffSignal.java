package MusicBoxCommandPattern;

class MusicBoxOffSignal implements BoxConfig {
    MusicBox musicBox;

    public MusicBoxOffSignal(MusicBox musicBox) {
        this.musicBox = musicBox;
    }

    public void execute() {
        musicBox.silencePlease();
    }
}