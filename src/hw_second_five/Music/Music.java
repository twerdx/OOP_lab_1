package hw_second_five.Music;

public class Music {
    private String name;
    private double time;
    private String genre;


    public Music(String name, double time, String genre) {
        this.name = name;
        this.time = time;
        this.genre = genre;
    }

    public String getName() { return name; }
    public double getTime() { return time; }
    public String getGenre() { return genre; }

}
