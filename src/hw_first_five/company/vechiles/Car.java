package hw_first_five.company.vechiles;

import hw_first_five.company.details.Engine;
import hw_first_five.company.professions.Driver;

public class Car {
    String brand;
    String classification;
    int weight;
    Driver driver;
    Engine engine;
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String brand, String classification, int weight,
               Driver driver, Engine engine) {
        this.brand = brand;
        this.classification = classification;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand + " (" + classification+ ")\n" +
                "Вес: " + weight + " кг\n" +
                "Водитель: " + driver.getFIO() + "\n" +
                "Двигатель: " + engine.getManufacture();
    }

}
