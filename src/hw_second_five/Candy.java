package hw_second_five;

import java.util.Arrays;
import java.util.Comparator;

public class Candy {

    private String name;
    private double weight;
    private double sugar;

    public Candy(String name, double weight, double sugar) {
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getSugar() {
        return sugar;
    }
    public void printInfo() {
        System.out.println(
                "Конфета: " + name +
                        ", вес: " + weight + " г" +
                        ", сахар: " + sugar + " г"
        );
    }
    public static double calculateWeight(Candy[] gift) {
        double totalWeight = 0;

        for (Candy candy : gift) {
            totalWeight += candy.weight;
        }

        return totalWeight;
    }

    public static void sortByWeight(Candy[] gift) {
        Arrays.sort(gift, Comparator.comparingDouble(Candy::getWeight));
    }

    public static void findBySugar(
            Candy[] gift,
            double minSugar,
            double maxSugar) {

        for (Candy candy : gift) {

            if (candy.sugar >= minSugar &&
                    candy.sugar <= maxSugar) {

                candy.printInfo();
            }
        }
    }

    public static void printAll(Candy[] gift) {

        for (Candy candy : gift) {
            candy.printInfo();
        }
    }
}