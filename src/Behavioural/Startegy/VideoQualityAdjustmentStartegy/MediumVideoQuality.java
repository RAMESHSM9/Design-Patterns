package Behavioural.Startegy.VideoQualityAdjustmentStartegy;

public class MediumVideoQuality implements QualityAdjustmentStrategy{
    @Override
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video adjust(Video video) {
        Video temp = new Video(video.getVideoUrl(), video.getVideoQuality());
        temp.setVideoQuality(VideoQuality.MEDIUM);
        temp.setCodec(VideoCodec.H265);
        temp.setBitrate(1000);
        return temp;
    }
}
