package bridgePattern;

public abstract class Video {

    VideoProcessor videoProcessor;

    Video(VideoProcessor videoProcessor) {
        this.videoProcessor = videoProcessor;
    }

    public abstract void play(String videoFile);

}
