package hw_second_five.Music;
import java.util.Scanner;

public class Playlist {
    private Music[] musicList;
    private int count = 0;

    public void fillFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько песен вы хотите добавить в плейлист? ");
        int size = scanner.nextInt();
        scanner.nextLine();
        musicList = new Music[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите название: ");
            String name = scanner.nextLine();

            System.out.print("Введите длительность (например, 3,5): ");
            double time = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Введите жанр: ");
            String genre = scanner.nextLine();

            musicList[count] = new Music(name, time, genre);
            count++;
        }
    }

    public void sortByGenre() {
        if (count == 0) return;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (musicList[j].getGenre().compareTo(musicList[j + 1].getGenre()) > 0) {
                    Music temp = musicList[j];
                    musicList[j] = musicList[j + 1];
                    musicList[j + 1] = temp;
                }
            }
        }
        System.out.println(" сортировки по жанру");
            for (int i = 0; i < count; i++) {
                System.out.println(musicList[i].getName() + " " + musicList[i].getGenre() + "");
            }
    }

    public void allTime() {
        double timer = 0;
        if (count == 0) {
            System.out.println("Плейлист пуст.");
            return;
        }
        for (int i = 0; i < count; i++) {
            timer += musicList[i].getTime();
        }
        System.out.println(timer);
    }
    public void findMusicByTime(){
        Scanner scanner = new Scanner(System.in);
        double time1 = scanner.nextDouble();
        double time2 = scanner.nextDouble();

        if (count == 0) {
            System.out.println("Плейлист пуст.");
            return;
        }
        for (int i = 0; i < count; i++) {
            if ((time1<=time2)&& (time1<=musicList[i].getTime())
                    && (time2>=musicList[i].getTime())){
                System.out.println(musicList[i].getName());
            }

        }
    }
}
