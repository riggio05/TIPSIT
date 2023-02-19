public class Main {

    public static void main(String[] args) {
        VideoDownloader videoDownloader;
        videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("video1");
        videoDownloader.getVideo("video1");
        videoDownloader.getVideo("video2");
        videoDownloader.getVideo("video1");
    }
}