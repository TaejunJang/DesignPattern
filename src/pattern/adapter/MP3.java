package pattern.adapter;

public class MP3 implements AudioPlayer {

	@Override
	public void play(String filename) {
		System.out.println("현재 재생곡:"+filename);
	}

}
