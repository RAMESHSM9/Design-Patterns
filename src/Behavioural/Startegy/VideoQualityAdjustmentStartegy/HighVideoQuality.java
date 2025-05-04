package Behavioural.Startegy.VideoQualityAdjustmentStartegy;

public class HighVideoQuality implements QualityAdjustmentStrategy{
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }

    @Override
    public Video adjust(Video video) {
        Video temp = new Video(video.getVideoUrl(), video.getVideoQuality());
        temp.setVideoQuality(VideoQuality.HIGH);
        temp.setCodec(VideoCodec.VP9);
        temp.setBitrate(2000);
        return temp;
    }
}
