package pattern.adapter;

public class MP4 implements VideoPlayer {

	@Override
	public void play(String filename) {
		System.out.println("동영상 재생이름:"+filename);
	}

}
