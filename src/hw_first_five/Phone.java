package hw_first_five;

public class Phone {
    private String Number;
    private String Model;
    private int Weight;

    public Phone(String number, String model, int weight) {
        this.Number = number;
        this.Model = model;
        this.Weight = weight;
    }
    public Phone(String number, String model) {
        Number = number;
        Model = model;
    }
    public Phone() {
    }

    public String getNumber() {
        return Number;
    }
    public void setNumber(String number) {
        Number = number;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public int getWeight() {
        return Weight;
    }
    public void setWeight(int weight) {
        Weight = weight;
    }
    public String receiveCall(String name ){
        return name;
    }
    public String receiveCall(String name, String number){
        return (name + " " + number);
    }
    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}

