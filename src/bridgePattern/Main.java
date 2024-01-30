package bridgePattern;

public class Main {

    public static void main(String[] args) {
        Video youtubeVideo = new YoutubeVideo(new HDVideoProcessor());
        youtubeVideo.play("abc.mp4");
        Video netflixVideo = new NetflixVideo(new UHD4KPProcess());
        netflixVideo.play("abc.mp4");

    }

}
