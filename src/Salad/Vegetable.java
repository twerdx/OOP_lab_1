package Salad;

public class Vegetable {
    private String name;
    private double weight;
    private double calories;

    public Vegetable(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getCalories() {
        return calories;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setCalories(double calories) {

        this.calories = calories;
    }
    @Override
    public String toString() {
        return "Овощ: " + name +
                ", вес: " + weight + " г" +
                ", калорийность: " + calories + " ккал/100 г";
    }
}