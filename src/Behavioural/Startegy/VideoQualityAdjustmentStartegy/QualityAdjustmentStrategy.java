package Behavioural.Startegy.VideoQualityAdjustmentStartegy;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();

    Video adjust(Video video);
}
