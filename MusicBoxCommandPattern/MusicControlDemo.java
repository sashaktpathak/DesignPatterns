package MusicBoxCommandPattern;

public class MusicControlDemo {
	public static void main(String[] args) {
		MyMusicSystem musicBoxControls = new MyMusicSystem();
		MusicBox musicBox = new MusicBox();
		BoxConfig lightsOn = new MusicBoxOnSignal(musicBox);
		BoxConfig lightsOff = new MusicBoxOffSignal(musicBox);
		// switch rockOn
		musicBoxControls.setConfig(lightsOn);
		musicBoxControls.buttonWasPressed();
		// switch silencePlease
		musicBoxControls.setConfig(lightsOff);
		musicBoxControls.buttonWasPressed();
	}
}
