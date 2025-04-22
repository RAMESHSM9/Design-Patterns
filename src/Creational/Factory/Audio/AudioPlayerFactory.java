package Factory.Audio;

import javax.print.attribute.standard.Media;

public class AudioPlayerFactory {
    public static AudioPlayer getAudioPlayer(MediaFormat mediaFormat, int volume, double playbackRate) {

        switch (mediaFormat)
        {
            case MP3 -> {
            return new MP3Player(volume, playbackRate);
            }

            case WAV -> {
            return new WAVPlayer(volume, playbackRate);
            }
            case FLAC -> {
                return new FLACPlayer(volume, playbackRate);
            }
        }

        throw new IllegalArgumentException("Unsupported audio format");
    }
}
