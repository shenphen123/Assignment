package core.javamedia;

public class MediaManager {

	public static void main(String[] args) {
		IMedia media = new PrintMedia();
	media.mode();

	media = new ElectronicMedia();
	media.mode();
	
	media = new SocialMedia();
	media.mode();
	}

}
