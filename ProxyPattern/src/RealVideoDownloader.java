public class RealVideoDownloader implements VideoDownloader {
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to https://www.youtube.com ...");
        System.out.println("Downloading " + videoName);
        return new Video(videoName);
    }
}