package mp3player.mp3;

public class Mp3Song {

    private String title;
    private String author;
    private String album;
    private String filePath;

    public Mp3Song(String title, String author, String album, String filePath) {

        this.title = title;
        this.author = author;
        this.album = album;
        this.filePath = filePath;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum() {
        this.album = album;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath() {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Mp3Song{" + "title=" + title + ", author=" + author + ", album=" + album + "}";

    }
}
