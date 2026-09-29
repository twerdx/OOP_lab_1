package myFiles.Flowers;

import java.util.Scanner;

public class Bouquet {

    private Flower[] flowers;
    private Accessory[] accessories;

    private int flowerCount = 0;
    private int accessoryCount = 0;

    public Bouquet(int flowerCapacity, int accessoryCapacity) {
        flowers = new Flower[flowerCapacity];
        accessories = new Accessory[accessoryCapacity];
    }

    public void addFlower(Flower flower) {
        if (flowerCount < flowers.length) {
            flowers[flowerCount] = flower;
            flowerCount++;
        } else {
            System.out.println("Нет места для нового цветка!");
        }
    }

    public void addAccessory(Accessory accessory) {
        if (accessoryCount < accessories.length) {
            accessories[accessoryCount] = accessory;
            accessoryCount++;
        } else {
            System.out.println("Нет места для нового аксессуара!");
        }
    }

    public int sum() {
        int sum = 0;

        for (int i = 0; i < flowerCount; i++) {
            sum += flowers[i].getPrice();
        }

        for (int i = 0; i < accessoryCount; i++) {
            sum += accessories[i].getPrice();
        }

        System.out.println("Стоимость букета: " + sum);
        return sum;
    }

    public void sortByFreshness() {
        for (int i = 0; i < flowerCount - 1; i++) {
            for (int j = 0; j < flowerCount - i - 1; j++) {

                if (flowers[j].getFreshness() >
                        flowers[j + 1].getFreshness()) {

                    Flower temp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temp;
                }
            }
        }

        System.out.println("Цветы по уровню свежести:");

        for (int i = 0; i < flowerCount; i++) {
            System.out.println(
                    flowers[i].getName() +
                            " свежесть: " +
                            flowers[i].getFreshness()
            );
        }
    }

    public void findFlowerByStemLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину стебля:");
        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();

        for (int i = 0; i < flowerCount; i++) {

            if (flowers[i].getStemLength() >= length1 &&
                    flowers[i].getStemLength() <= length2) {

                System.out.println(
                        flowers[i].getName() +
                                " длина стебля: " +
                                flowers[i].getStemLength()
                );
            }
        }
    }
}