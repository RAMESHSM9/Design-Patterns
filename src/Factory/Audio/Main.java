package Factory.Audio;

public class Main {
    public static void main(String[] args) {

        AudioPlayer ap = AudioPlayerFactory.getAudioPlayer(MediaFormat.MP3, 10, 10.5);


    }
}
