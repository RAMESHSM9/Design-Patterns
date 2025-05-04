package Behavioural.Startegy.VideoQualityAdjustmentStartegy;

public class LowVideoQuality implements QualityAdjustmentStrategy{
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @Override
    public Video adjust(Video video) {
        Video temp = new Video(video.getVideoUrl(), video.getVideoQuality());
        temp.setVideoQuality(VideoQuality.LOW);
        temp.setCodec(VideoCodec.H264);
        temp.setBitrate(500);
        return temp;
    }
}
