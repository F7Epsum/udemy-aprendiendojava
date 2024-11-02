package Objetos.Clase14Interfaces2;

public class MediaDownloader {

    public interface DownloadListener{
        void onMediaDownloaded(String content);
    }

    public static void download(String mediaTitle, DownloadListener downloadListener){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading " + mediaTitle);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(mediaTitle + " Downloaded! Eres un pirata xd\n");
                String content = "Un tipo le matan su perrito y el protagonista se desquita con todos";
                downloadListener.onMediaDownloaded(content);
            }
        });

        thread.start();

    }
}
