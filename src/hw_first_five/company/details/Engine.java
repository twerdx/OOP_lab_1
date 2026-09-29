package hw_first_five.company.details;

public class Engine {
    String power;
    String manufacture;

    public Engine(String power, String manufacture) {
        this.power = power;
        this.manufacture = manufacture;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

}
