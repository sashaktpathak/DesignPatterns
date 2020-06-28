package MusicBoxCommandPattern;

class MusicBoxOnSignal implements BoxConfig {
   MusicBox musicBox;

   public MusicBoxOnSignal(MusicBox musicBox) {
      this.musicBox = musicBox;
   }

   public void execute() {
      musicBox.rockOn();
   }
}