package pattern.adapter;

public class Main {

	public static void main(String[] args) {
		
		//mp3플레이어 재생
		AudioPlayer mp3Player = new MP3();
		mp3Player.play("아이유 좋은날");
		
		//영상 재생 인터페이스를 어댑터 적용
		//오디오 재생 인터페이스 호출
		mp3Player = new FormatAdapter(new MP4());
		mp3Player.play("신세계 영화");
		
	}
}
