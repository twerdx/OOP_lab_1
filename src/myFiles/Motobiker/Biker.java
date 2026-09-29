package myFiles.Motobiker;

import java.util.Scanner;

public class Biker {

    public Biker(String name, int maxCapacity) {
        this.name = name;
        this.ammunitionList = new Ammunition[maxCapacity];
        this.count = 0;
    }

    String name;
    Ammunition[] ammunitionList;
    private int count;

    public void addAmmunition(Ammunition item) {
        if (count < ammunitionList.length) {
            ammunitionList[count] = item;
            count++;
        } else {
            System.out.println("Нет места для новой амуниции!");
        }
    }

    public double sum() {
        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += ammunitionList[i].getPrice();
        }

        System.out.println("Общая стоимость: " + sum);
        return sum;
    }

    public void sortByWeight() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (ammunitionList[j].getWeight() >
                        ammunitionList[j + 1].getWeight()) {
                    Ammunition temp = ammunitionList[j];
                    ammunitionList[j] = ammunitionList[j + 1];
                    ammunitionList[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(ammunitionList[i].getName());
        }
    }

    public void findAmmunitionByPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите минимальную и максимальную цену:");
        int price1 = scanner.nextInt();
        int price2 = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            if (ammunitionList[i].getPrice() >= price1 &&
                    ammunitionList[i].getPrice() <= price2) {

                System.out.println(ammunitionList[i].getName());
            }
        }
    }
}