package MusicBoxCommandPattern;

public class MyMusicSystem {
    BoxConfig slot;

    public MyMusicSystem() {
    }

    public void setConfig(BoxConfig boxConfig) {
        slot = boxConfig;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
