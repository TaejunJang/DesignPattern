package pattern.adapter;

public class FormatAdapter implements AudioPlayer {

	VideoPlayer videoPlayer;
	
	public FormatAdapter(VideoPlayer video) {
		this.videoPlayer = video;
	}
	
	
	@Override
	public void play(String filename) {
		videoPlayer.play(filename);
	}

}
