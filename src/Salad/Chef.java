package Salad;

public class Chef {
    private Vegetable[] vegetables;
    private int count;

    public Chef(int maxCapacity) {
        vegetables = new Vegetable[maxCapacity];
        count = 0;
    }
    public void addVegetable(Vegetable vegetable) {
        if (count < vegetables.length) {
            vegetables[count] = vegetable;
            count++;
        }
    }
    public double getTotalCalories() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += vegetables[i].getCalories() *
                    vegetables[i].getWeight() / 100;
        }
        return total;
    }
    public void sortByCalories() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (vegetables[j].getCalories() >
                        vegetables[j + 1].getCalories()) {

                    Vegetable temp = vegetables[j];
                    vegetables[j] = vegetables[j + 1];
                    vegetables[j + 1] = temp;
                }
            }
        }
    }
    public void findVegetablesByCalories(double min, double max) {
        System.out.println("Овощи в диапазоне от " + min +
                " до " + max + " ккал:");
        for (int i = 0; i < count; i++) {
            double calories = vegetables[i].getCalories();

            if (calories >= min && calories <= max) {
                System.out.println(vegetables[i]);
            }
        }
    }
    public void printVegetables() {
        for (int i = 0; i < count; i++) {
            System.out.println(vegetables[i]);
        }
    }
}