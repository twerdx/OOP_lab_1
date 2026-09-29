package myFiles.NewYearGift;

public abstract class Candy {
    private String name;
    private int weight;
    private int sugar;
    private int price;

    public Candy(String name, int weight, int sugar, int price) {
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
        this.price = price;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
    public int getSugar() {return sugar;}
    public void setSugar(int sugar) {this.sugar = sugar;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
}