package hw_second_five;

import java.util.Arrays;
import java.util.Comparator;

public class Appliance {

    private String name;
    private double power;
    private boolean pluggedIn;

    public Appliance(String name, double power, boolean pluggedIn) {
        this.name = name;
        this.power = power;
        this.pluggedIn = pluggedIn;
    }

    public String getName() {
        return name;
    }
    public double getPower() {
        return power;
    }
    public boolean isPluggedIn() {
        return pluggedIn;
    }
    public void printInfo() {
        System.out.println(
                "Прибор: " + name +
                        ", мощность: " + power + " Вт" +
                        ", подключен: " +
                        (pluggedIn ? "да" : "нет")
        );
    }

    public static double calculatePower(Appliance[] appliances) {
        double totalPower = 0;
        for (Appliance appliance : appliances) {
            if (appliance.pluggedIn) {
                totalPower += appliance.power;
            }}return totalPower;
    }

    public static void sortByPower(Appliance[] appliances) {
        for (int i = 0; i < appliances.length - 1; i++) {
            for (int j = i + 1; j < appliances.length; j++) {
                if (appliances[i].getPower() > appliances[j].getPower()) {
                    Appliance temp = appliances[i];
                    appliances[i] = appliances[j];
                    appliances[j] = temp;
                }}}
    }
    public static void findByPower(Appliance[] appliances, double minPower, double maxPower) {
        for (Appliance appliance : appliances) {
            if (appliance.power >= minPower &&
                    appliance.power <= maxPower) {

                appliance.printInfo();}}
    }
    public static void printAll(Appliance[] appliances) {
        for (Appliance appliance : appliances) {
            appliance.printInfo();
        }
    }
}