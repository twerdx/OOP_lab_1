package myFiles.NewYearGift;

import java.util.Scanner;

public class Gift {
    private Candy[] candies;
    private int count = 0;
    public Gift(int maxCapacity) {
        candies = new Candy[maxCapacity];
    }
    public void addCandy(Candy candy) {
        if (count < candies.length) {
            candies[count] = candy;
            count++;
        } else {
            System.out.println("Нет места для новой конфеты!");
        }
    }
    public int getWeight() {
        int weight = 0;
        for (int i = 0; i < count; i++) {
            weight += candies[i].getWeight();
        }
        System.out.println("Вес подарка: " + weight + " г");
        return weight;
    }
    public void sortByWeight() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if (candies[j].getWeight() >
                        candies[j + 1].getWeight()) {
                    Candy temp = candies[j];
                    candies[j] = candies[j + 1];
                    candies[j + 1] = temp;
                }
            }
        }
        System.out.println("Конфеты по весу:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                    candies[i].getName() +
                            " " +
                            candies[i].getWeight() +
                            " г"
            );
        }
    }
    public void findCandyBySugar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальное и максимальное содержание сахара:");
        int sugar1 = scanner.nextInt();
        int sugar2 = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            if (candies[i].getSugar() >= sugar1 &&
                    candies[i].getSugar() <= sugar2) {
                System.out.println(
                        candies[i].getName() +
                                " сахар: " +
                                candies[i].getSugar() + "%"
                );
            }
        }
    }
}